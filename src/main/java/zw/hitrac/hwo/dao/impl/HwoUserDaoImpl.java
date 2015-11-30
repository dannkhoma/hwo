package zw.hitrac.hwo.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zw.hitrac.hwo.dao.HwoUserDao;
import zw.hitrac.hwo.domain.HwoUser;
import zw.hitrac.hwo.repository.HwoUserRepository;

/**
 *
 * @author Daniel Nkhoma
 */
@Repository
public class HwoUserDaoImpl implements HwoUserDao {

    @Autowired
    private HwoUserRepository hwoUserRepository;

    @Override
    public HwoUser save(HwoUser hwoUser) {
        return hwoUserRepository.save(hwoUser);
    }

    @Override
    public List<HwoUser> findAll() {
        return hwoUserRepository.findAll();
    }

    @Override
    public HwoUser findOne(Long id) {
        return hwoUserRepository.findOne(id);
    }

    @Override
    public HwoUser findByUuid(String Uuid) {
        return hwoUserRepository.findByUuid(Uuid);
    }

}
