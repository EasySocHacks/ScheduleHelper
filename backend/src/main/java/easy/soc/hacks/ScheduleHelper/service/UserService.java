package easy.soc.hacks.ScheduleHelper.service;

import easy.soc.hacks.ScheduleHelper.entity.User;
import easy.soc.hacks.ScheduleHelper.form.EnterForm;
import easy.soc.hacks.ScheduleHelper.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(EnterForm enterForm) {
        User user = new User();

        user.setLogin(enterForm.getLogin());
        userRepository.save(user);
        userRepository.updatePassword(user.getId(), enterForm.getLogin(), enterForm.getPassword());

        return user;
    }

    public User findByLoginAndPassword(String login, String password) {
        return login == null || password == null ? null : userRepository.findByLoginAndPassword(login, password);
    }

    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }
}
