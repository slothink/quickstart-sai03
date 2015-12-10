package world.sai.misc.quickstart.sai02.core.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import world.sai.misc.quickstart.sai02.test.DefaultTestCase;

/**
 * Created by sai on 15. 10. 13..
 */
public class UserServiceTest extends DefaultTestCase {

    @Autowired
    UserService userService;

    @Test
    public void testCRUD() {
        userService.getAllLst();
    }
}
