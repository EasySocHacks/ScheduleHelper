package easy.soc.hacks.ScheduleHelper.repository;

import easy.soc.hacks.ScheduleHelper.entity.Task;
import easy.soc.hacks.ScheduleHelper.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByUser(User user);
}
