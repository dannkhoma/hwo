package zw.hitrac.hwo.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zw.hitrac.hwo.dao.StaffEstablishmentDao;
import zw.hitrac.hwo.domain.StaffEstablishment;
import zw.hitrac.hwo.repository.StaffEstablishmentRepository;

/**
 *
 * @author Tonderai Ndangana
 */
@Repository
public class StaffEstablishmentDaoImpl implements StaffEstablishmentDao {

    @Autowired
    private StaffEstablishmentRepository staffEstablishmentRepository;

    @Override
    public StaffEstablishment save(StaffEstablishment StationEstablishment) {

        return staffEstablishmentRepository.save(StationEstablishment);
    }

    @Override
    public List<StaffEstablishment> findAll() {
        return staffEstablishmentRepository.findAll();
    }

    @Override
    public StaffEstablishment findOne(Long id) {
        return staffEstablishmentRepository.findOne(id);
    }

    @Override
    public StaffEstablishment findByUuid(String uuid) {
        return staffEstablishmentRepository.findByUuid(uuid);
    }

}
