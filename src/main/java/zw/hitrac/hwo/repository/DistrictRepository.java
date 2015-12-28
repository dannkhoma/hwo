package zw.hitrac.hwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.hitrac.hwo.domain.District;

/**
 *
 * @author Daniel Nkhoma
 */
public interface DistrictRepository extends JpaRepository<District, Long> {

    public District findByUuid(String uuid);

    public District findByMohccUuid(String mohccUuid);

}
