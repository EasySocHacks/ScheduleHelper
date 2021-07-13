package easy.soc.hacks.ScheduleHelper.controller;

import easy.soc.hacks.ScheduleHelper.form.EnterForm;
import easy.soc.hacks.ScheduleHelper.form.validator.LoginFormValidator;
import easy.soc.hacks.ScheduleHelper.form.validator.RegisterFormValidator;
import easy.soc.hacks.ScheduleHelper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class EnterController extends InheritController {
    private final UserService userService;
    private final RegisterFormValidator registerFormValidator;
    private final LoginFormValidator loginFormValidator;

    public EnterController(UserService userService, RegisterFormValidator registerFormValidator, LoginFormValidator loginFormValidator) {
        this.userService = userService;
        this.registerFormValidator = registerFormValidator;
        this.loginFormValidator = loginFormValidator;
    }

    @InitBinder("registerForm")
    public void initRegisterBinder(WebDataBinder binder) {
        binder.addValidators(registerFormValidator);
    }

    @InitBinder("loginForm")
    public void initLoginBinder(WebDataBinder binder) {
        binder.addValidators(loginFormValidator);
    }

    @GetMapping("/register")
    public String registerGet(Model model) {
        model.addAttribute("registerForm", new EnterForm());

        return "/enter/RegisterPage";
    }

    @PostMapping("/register")
    public String registerPost(@ModelAttribute("registerForm") EnterForm enterForm,
                               BindingResult bindingResult,
                               HttpSession httpSession) {
        if (bindingResult.hasErrors()) {
            return "/enter/RegisterPage";
        }

        setUser(httpSession, userService.register(enterForm));

        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginGet(Model model) {
        model.addAttribute("loginForm", new EnterForm());

        return "/enter/LoginPage";
    }

    @PostMapping("/login")
    public String loginPost(@ModelAttribute("loginForm") EnterForm enterForm,
                            BindingResult bindingResult,
                            HttpSession httpSession) {
        if (bindingResult.hasErrors()) {
            return "/enter/LoginPage";
        }

        setUser(httpSession, userService.findByLoginAndPassword(enterForm.getLogin(), enterForm.getPassword()));

        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession) {
        unsetUser(httpSession);

        return "redirect:/";
    }
}
