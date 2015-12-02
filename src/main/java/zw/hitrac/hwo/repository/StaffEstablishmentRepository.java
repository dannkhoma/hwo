package zw.hitrac.hwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.hitrac.hwo.domain.StaffEstablishment;

/**
 *
 * @author Tonderai Ndangana
 */
public interface StaffEstablishmentRepository extends JpaRepository<StaffEstablishment, Long> {

    public StaffEstablishment findByUuid(String uuid);

}
