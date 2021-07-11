package easy.soc.hacks.ScheduleHelper.repository;

import easy.soc.hacks.ScheduleHelper.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
