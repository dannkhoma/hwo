package zw.hitrac.hwo.controller.rest;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zw.hitrac.hwo.domain.Post;
import zw.hitrac.hwo.service.PostService;

/**
 *
 * @author Daniel Nkhoma
 */
@RestController
public class PostRestController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/posts/post/save", method = RequestMethod.POST)
    public Post createPost(@RequestBody @Valid final Post post) {
        return postService.save(post);
    }

    @RequestMapping("/posts/post/get_post/{post_id}")
    public Post getHwoPost(@PathVariable String post_id) {
        Post post = postService.findByMohccUuid(post_id);
        return post;
    }
}
