package zw.hitrac.hwo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import zw.hitrac.hwo.dao.HwoUserDao;
import zw.hitrac.hwo.domain.HwoUser;
import zw.hitrac.hwo.service.HwoUserService;

/**
 *
 * @author Daniel Nkhoma
 */
public class HwoUserServiceImpl implements HwoUserService {

    @Autowired
    private HwoUserDao hwoUserDao;

    @Override
    public HwoUser save(HwoUser hwoUser) {
        return hwoUserDao.save(hwoUser);
    }

    @Override
    public List<HwoUser> findAll() {
        return hwoUserDao.findAll();
    }

    @Override
    public HwoUser findOne(Long id) {
        return hwoUserDao.findOne(id);
    }

    @Override
    public HwoUser findByUuid(String uuid) {
        return hwoUserDao.findByUuid(uuid);
    }

}
