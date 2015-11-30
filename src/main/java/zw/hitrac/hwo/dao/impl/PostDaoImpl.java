/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.hitrac.hwo.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zw.hitrac.hwo.dao.PostDao;
import zw.hitrac.hwo.domain.Post;
import zw.hitrac.hwo.repository.PostRepository;

/**
 *
 * @author hitrac
 */
@Repository
public class PostDaoImpl implements PostDao {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findOne(Long id) {
        return postRepository.findOne(id);

    }

    @Override
    public Post findByUuid(String uuid) {
        return postRepository.findByUuid(uuid);

    }

    @Override
    public Post findByMohccUuid(String mohccUuid) {
        return postRepository.findByMohccUuid(mohccUuid);
    }

}
