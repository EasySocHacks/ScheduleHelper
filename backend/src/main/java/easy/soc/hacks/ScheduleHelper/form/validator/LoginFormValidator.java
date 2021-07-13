package easy.soc.hacks.ScheduleHelper.form.validator;

import easy.soc.hacks.ScheduleHelper.form.EnterForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LoginFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return EnterForm.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        return;
    }
}
