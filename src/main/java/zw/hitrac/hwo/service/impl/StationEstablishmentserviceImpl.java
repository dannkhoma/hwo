
package zw.hitrac.hwo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.hitrac.hwo.dao.StationEstablishmentDao;
import zw.hitrac.hwo.domain.StationEstablishment;
import zw.hitrac.hwo.service.StationEstablishmentService;

/**
 *
 * @author Tonderai Ndangana
 */
@Service
public class StationEstablishmentserviceImpl implements  StationEstablishmentService{
    
    @Autowired
    private StationEstablishmentDao stationEstablishmentDao;

    @Override
    public StationEstablishment save(StationEstablishment stationEstablishment) {
        return stationEstablishmentDao.save(stationEstablishment);
        }

    @Override
    public List<StationEstablishment> findAll() {
        return stationEstablishmentDao.findAll();
    }

    @Override
    public StationEstablishment findOne(Long id) {
        return stationEstablishmentDao.findOne(id);
    }

    @Override
    public StationEstablishment findByUuid(String uuid) {
        return stationEstablishmentDao.findByUuid(uuid);
    }
    
}
