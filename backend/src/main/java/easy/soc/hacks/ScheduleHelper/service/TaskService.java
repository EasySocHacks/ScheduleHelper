package easy.soc.hacks.ScheduleHelper.service;

import easy.soc.hacks.ScheduleHelper.entity.Task;
import easy.soc.hacks.ScheduleHelper.entity.User;
import easy.soc.hacks.ScheduleHelper.form.TaskForm;
import easy.soc.hacks.ScheduleHelper.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task create(User user, TaskForm taskForm) {
        Task task = new Task();

        task.setUser(user);
        task.setTitle(taskForm.getTitle());
        task.setDescription(taskForm.getDescription());

        taskRepository.save(task);

        return task;
    }

    public List<Task> findAllByUser(User user) {
        if (user == null) {
            return List.of();
        }

        return taskRepository.findAllByUser(user);
    }
}
