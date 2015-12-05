package zw.hitrac.hwo.controller.admin;

import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import zw.hitrac.hwo.domain.Post;
import zw.hitrac.hwo.domain.StaffEstablishment;
import zw.hitrac.hwo.service.PostService;
import zw.hitrac.hwo.service.StaffEstablishmentService;

/**
 *
 * @author Tonderai Ndangana
 */
@Controller
public class StaffEstablishmentController {

    @Autowired
    private StaffEstablishmentService staffEstablishmentService;
    @Autowired
    private PostService postService;
    
    
    @ModelAttribute("posts")
    public Collection<Post> getPosts() {
        return postService.findAll();
    }

    @RequestMapping(value = "/staffEstablishments", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("staffEstablishments", staffEstablishmentService.findAll());
        return "staffEstablishmentListPage";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/staffEstablishments/staffEstablishment")
    public String showform(Model model, @RequestParam(required = false, value = "id") Long id) {
        StaffEstablishment staffEstablishment;
        if (id == null) {
            staffEstablishment = new StaffEstablishment();
        } else {
            staffEstablishment = staffEstablishmentService.findOne(id);
        }
        model.addAttribute("staffEstablishment", staffEstablishment);

        return "staffEstablishmentEditPage";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/staffEstablishments/staffEstablishment")
    public String form(@Valid StaffEstablishment staffEstablishment, BindingResult result, Model model) {
        staffEstablishmentService.save(staffEstablishment);
        return "redirect:/staffEstablishments";
    }

}
