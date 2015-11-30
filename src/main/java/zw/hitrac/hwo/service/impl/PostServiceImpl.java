package zw.hitrac.hwo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.hitrac.hwo.dao.PostDao;
import zw.hitrac.hwo.domain.Post;
import zw.hitrac.hwo.service.PostService;

/**
 *
 * @author hitrac
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao postDao;

    @Override
    public Post save(Post post) {
        return postDao.save(post);
    }

    @Override
    public List<Post> findAll() {
        return postDao.findAll();
    }

    @Override
    public Post findOne(Long id) {
        return postDao.findOne(id);
    }

    @Override
    public Post findByUuid(String uuid) {
        return postDao.findByUuid(uuid);
    }

    @Override
    public Post findByMohccUuid(String mohccUuid) {
        return postDao.findByMohccUuid(mohccUuid);
    }

}
