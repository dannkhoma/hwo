package zw.hitrac.hwo.util;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import zw.hitrac.hwo.domain.Post;
import zw.hitrac.hwo.service.PostService;

/**
 *
 * @author Daniel
 */
public class PostFormatter implements Formatter<Post> {

    @Autowired
    private PostService postService;

    @Override
    public String print(Post post, Locale locale) {
        return post.getName();
    }

    @Override
    public Post parse(String text, Locale locale) throws ParseException {
        List<Post> posts = postService.findAll();
        for (Post post : posts) {
            if (post.getName().equals(text)) {
                return post;
            }
        }
        throw new ParseException("type not found: " + text, 0);
    }

}
