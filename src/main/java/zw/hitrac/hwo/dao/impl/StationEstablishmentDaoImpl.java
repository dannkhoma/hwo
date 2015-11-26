
package zw.hitrac.hwo.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zw.hitrac.hwo.dao.StationEstablishmentDao;
import zw.hitrac.hwo.domain.StationEstablishment;
import zw.hitrac.hwo.repository.PostRepository;
import zw.hitrac.hwo.repository.StationEstablishmentRepository;

/**
 *
 * @author Tonderai Ndangana
 */
@Repository
public class StationEstablishmentDaoImpl implements StationEstablishmentDao{
    
    
    @Autowired
    private StationEstablishmentRepository  stationEstablishmentRepository;

    @Override
    public StationEstablishment save(StationEstablishment StationEstablishment) {
        
      return  stationEstablishmentRepository.save(StationEstablishment);
    }

    @Override
    public List<StationEstablishment> findAll() {
      return  stationEstablishmentRepository.findAll();
    }

    @Override
    public StationEstablishment findOne(Long id) {
     return  stationEstablishmentRepository.findOne(id);
    }

    @Override
    public StationEstablishment findByUuid(String uuid) {
        
        return  stationEstablishmentRepository.findByUuid(uuid);
       
    }
    
}
