package zw.hitrac.hwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.hitrac.hwo.domain.StationEstablishment;

/**
 *
 * @author Tonderai Ndangana
 */
public interface StationEstablishmentRepository extends JpaRepository<StationEstablishment, Long> {

    public StationEstablishment findByUuid(String uuid);

}
