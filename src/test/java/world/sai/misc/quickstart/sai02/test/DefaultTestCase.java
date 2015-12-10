package world.sai.misc.quickstart.sai02.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by sai on 15. 10. 13..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:application-core.xml"})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
@Transactional
public class DefaultTestCase {

    @Before
    public void testInit() {
        p("init world.sai.misc.quickstart data");

    }

    public void p(Object o) {
        print(o);
    }

    public void print(Object o) {
        System.out.println("TLOG:"+o);
    }

    @Test
    public void testRun() {

    }
}

