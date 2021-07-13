package easy.soc.hacks.ScheduleHelper.form.validator;

import easy.soc.hacks.ScheduleHelper.form.TaskForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class TaskFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return TaskForm.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        return;
    }
}
