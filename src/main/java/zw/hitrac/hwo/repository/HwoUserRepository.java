package zw.hitrac.hwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.hitrac.hwo.domain.HwoUser;

/**
 *
 * @author Daniel Nkhoma
 */
public interface HwoUserRepository extends JpaRepository<HwoUser, Long> {

    public HwoUser findByUuid(String uuid);

}
