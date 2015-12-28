package zw.hitrac.hwo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.hitrac.hwo.dao.DistrictDao;
import zw.hitrac.hwo.domain.District;
import zw.hitrac.hwo.service.DistrictService;

/**
 *
 * @author Daniel Nkhoma
 */
@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictDao districtDao;

    @Override
    public District save(District district) {
        return districtDao.save(district);
    }

    @Override
    public List<District> findAll() {
        return districtDao.findAll();
    }

    @Override
    public District findOne(Long id) {
        return districtDao.findOne(id);
    }

    @Override
    public District findByUuid(String uuid) {
        return districtDao.findByUuid(uuid);
    }

    @Override
    public District findByMohccUuid(String mohccUuid) {
        return districtDao.findByMohccUuid(mohccUuid);
    }

}
