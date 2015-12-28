package zw.hitrac.hwo.controller.admin;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import zw.hitrac.hwo.domain.Post;
import zw.hitrac.hwo.service.PostService;

/**
 *
 * @author Tonderai Ndangana
 */
@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("posts", postService.findAll());
        return "admin/postListPage";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/posts/post")
    public String showform(Model model, @RequestParam(required = false, value = "id") Long id) {
        Post post;
        if (id == null) {
            post = new Post();
        } else {
            post = postService.findOne(id);
        }
        model.addAttribute("post", post);

        return "admin/postEditPage";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/posts/post")
    public String form(@Valid Post post, BindingResult result, Model model) {
        postService.save(post);
        return "redirect:/posts";
    }

}
