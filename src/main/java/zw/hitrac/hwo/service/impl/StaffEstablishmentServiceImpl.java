package zw.hitrac.hwo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.hitrac.hwo.dao.StaffEstablishmentDao;
import zw.hitrac.hwo.domain.StaffEstablishment;
import zw.hitrac.hwo.service.StaffEstablishmentService;

/**
 *
 * @author Tonderai Ndangana
 */
@Service
public class StaffEstablishmentServiceImpl implements StaffEstablishmentService {

    @Autowired
    private StaffEstablishmentDao stationEstablishmentDao;

    @Override
    public StaffEstablishment save(StaffEstablishment stationEstablishment) {
        return stationEstablishmentDao.save(stationEstablishment);
    }

    @Override
    public List<StaffEstablishment> findAll() {
        return stationEstablishmentDao.findAll();
    }

    @Override
    public StaffEstablishment findOne(Long id) {
        return stationEstablishmentDao.findOne(id);
    }

    @Override
    public StaffEstablishment findByUuid(String uuid) {
        return stationEstablishmentDao.findByUuid(uuid);
    }

}
