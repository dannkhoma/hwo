
package zw.hitrac.hwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.hitrac.hwo.domain.Post;

/**
 *
 * @author Tonderai Ndangana
 */
public interface PostRepository extends JpaRepository<Post, Long> {
    
      public Post  findByUuid(String uuid);

    
}
