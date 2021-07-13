package easy.soc.hacks.ScheduleHelper.controller;

import easy.soc.hacks.ScheduleHelper.form.TaskForm;
import easy.soc.hacks.ScheduleHelper.form.validator.TaskFormValidator;
import easy.soc.hacks.ScheduleHelper.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/tasks")
public class TaskController extends InheritController {
    private final TaskService taskService;
    private final TaskFormValidator taskFormValidator;

    public TaskController(TaskService taskService, TaskFormValidator taskFormValidator) {
        this.taskService = taskService;
        this.taskFormValidator = taskFormValidator;
    }

    @InitBinder("taskForm")
    public void initTaskBinder(WebDataBinder binder) {
        binder.addValidators(taskFormValidator);
    }

    @GetMapping("/list")
    public String list(HttpSession httpSession) {
        httpSession.setAttribute("taskList", taskService.findAllByUser(getUser(httpSession)));

        return "/task/ListTaskPage";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("taskForm", new TaskForm());

        return "/task/AddTaskPage";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("taskForm") TaskForm taskForm,
                      BindingResult bindingResult,
                      HttpSession httpSession) {

        if (bindingResult.hasErrors()) {
            return "/task/ListTaskPage";
        }

        taskService.create(getUser(httpSession), taskForm);

        return "redirect:/tasks/list";
    }
}
