package world.sai.misc.quickstart.sai02.core.user;

import javax.transaction.Transactional;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sai on 15. 9. 25..
 */
@Transactional
public interface UserService {
    Iterable<User> getAllLst();

    User save(User user);

    void delete(User user);
}
