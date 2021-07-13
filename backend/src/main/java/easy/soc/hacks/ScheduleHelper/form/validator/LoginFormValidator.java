package easy.soc.hacks.ScheduleHelper.form.validator;

import easy.soc.hacks.ScheduleHelper.form.EnterForm;
import easy.soc.hacks.ScheduleHelper.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LoginFormValidator implements Validator {
    private final UserService userService;

    public LoginFormValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return EnterForm.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        if (!errors.hasErrors()) {
            if (userService.findByLoginAndPassword(
                    ((EnterForm) o).getLogin(),
                    ((EnterForm) o).getPassword()) == null) {
                errors.rejectValue("login","login-or-password.incorrect", "Invalid login or password");
            }
        }
    }
}
