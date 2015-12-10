package world.sai.misc.quickstart.sai02.core.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by sai on 15. 9. 25..
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository repository;

    @Override
    public Iterable<User> getAllLst() {
        return repository.findAll();
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }
}
