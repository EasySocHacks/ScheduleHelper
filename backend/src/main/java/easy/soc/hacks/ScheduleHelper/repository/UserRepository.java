package easy.soc.hacks.ScheduleHelper.repository;

import easy.soc.hacks.ScheduleHelper.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE user SET password=SHA1(CONCAT('1be3db47a7684152', ?2, ?3)) WHERE id=?1", nativeQuery = true)
    void updatePassword(long id, String login, String password);

    @Query(value = "SELECT * FROM user WHERE login=?1 AND password=SHA1(CONCAT('1be3db47a7684152', ?1, ?2))", nativeQuery = true)
    User findByLoginAndPassword(String login, String password);

    User findByLogin(String login);
}
