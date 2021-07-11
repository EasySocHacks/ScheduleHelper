package easy.soc.hacks.ScheduleHelper.repository;

import easy.soc.hacks.ScheduleHelper.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
