package zw.hitrac.hwo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.hitrac.hwo.dao.FacilityDao;
import zw.hitrac.hwo.domain.Facility;
import zw.hitrac.hwo.service.FacilityService;

/**
 *
 * @author hitrac
 */
@Service
public class FacilityServiceImpl implements FacilityService{
    
    @Autowired
    private FacilityDao facilityDao;

    @Override
    public Facility save(Facility facility) {
        return facilityDao.save(facility);
        }

    @Override
    public List<Facility> findAll() {
        return facilityDao.findAll();
    }

    @Override
    public Facility findOne(Long id) {
        return facilityDao.findOne(id);
    }

    @Override
    public Facility findByUuid(String uuid) {
        return facilityDao.findByUuid(uuid);
    }
    
}
