package world.sai.misc.quickstart.sai02.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sai on 15. 10. 14..
 */
@Controller
public class IndexController {

    @RequestMapping("/index.do")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("tiles/default/index");
        System.out.println("index");
        return mav;
    }

    @RequestMapping("/test.do")
    public ModelAndView test() {
        ModelAndView mav = new ModelAndView("test");
        System.out.println("test");
        return mav;
    }
}
