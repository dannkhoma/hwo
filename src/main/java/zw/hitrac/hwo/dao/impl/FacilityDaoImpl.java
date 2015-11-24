package zw.hitrac.hwo.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zw.hitrac.hwo.dao.FacilityDao;
import zw.hitrac.hwo.domain.Facility;
import zw.hitrac.hwo.repository.FacilityRepository;

/**
 *
 * @author hitrac
 */
@Repository
public class FacilityDaoImpl implements FacilityDao{
    
    @Autowired
    private FacilityRepository facilityRepository;

    @Override
    public Facility save(Facility facility) {
        return facilityRepository.save(facility);
    }

    @Override
    public List<Facility> findAll() {
        return facilityRepository.findAll();
    }

    @Override
    public Facility findOne(Long id) {
       return facilityRepository.findOne(id);
    }

    @Override
    public Facility findByUuid(String uuid) {
       return facilityRepository.findByUuid(uuid);
    }
    
}
