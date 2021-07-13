package easy.soc.hacks.ScheduleHelper.form.validator;

import easy.soc.hacks.ScheduleHelper.form.EnterForm;
import easy.soc.hacks.ScheduleHelper.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RegisterFormValidator implements Validator {
    private final UserService userService;

    public RegisterFormValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return EnterForm.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        if (!errors.hasErrors()) {
            if (userService.findByLogin(((EnterForm) o).getLogin()) != null) {
                errors.rejectValue("login", "login.in-use", "Login is in use");
            }
        }
    }
}
