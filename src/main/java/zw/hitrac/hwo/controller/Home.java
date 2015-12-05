package zw.hitrac.hwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Tonderai Ndangana
 */
@Controller
public class Home {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/about")
    public String  aboutHwo () {
        return "aboutHwo";
    }
}

    
