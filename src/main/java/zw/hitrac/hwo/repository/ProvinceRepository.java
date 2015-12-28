package zw.hitrac.hwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.hitrac.hwo.domain.Province;

/**
 *
 * @author Daniel Nkhoma
 */
public interface ProvinceRepository extends JpaRepository<Province, Long> {

    public Province findByUuid(String uuid);

    public Province findByMohccUuid(String mohccUuid);

}
