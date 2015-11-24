package zw.hitrac.hwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.hitrac.hwo.domain.Facility;

/**
 *
 * @author Phineas Chikumba
 */
public interface FacilityRepository extends JpaRepository<Facility, Long>{
    
     public Facility findByUuid(String uuid);
    
}
