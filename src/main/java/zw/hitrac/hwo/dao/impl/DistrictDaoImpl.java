package zw.hitrac.hwo.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zw.hitrac.hwo.dao.DistrictDao;
import zw.hitrac.hwo.domain.District;
import zw.hitrac.hwo.repository.DistrictRepository;

/**
 *
 * @author Daniel Nkhoma
 */
@Repository
public class DistrictDaoImpl implements DistrictDao {

    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public District save(District district) {
        return districtRepository.save(district);
    }

    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }

    @Override
    public District findOne(Long id) {
        return districtRepository.findOne(id);

    }

    @Override
    public District findByUuid(String uuid) {
        return districtRepository.findByUuid(uuid);

    }

    @Override
    public District findByMohccUuid(String mohccUuid) {
        return districtRepository.findByMohccUuid(mohccUuid);
    }

}
