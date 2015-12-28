package zw.hitrac.hwo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.hitrac.hwo.dao.ProvinceDao;
import zw.hitrac.hwo.domain.Province;
import zw.hitrac.hwo.service.ProvinceService;

/**
 *
 * @author Daniel Nkhoma
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceDao provinceDao;

    @Override
    public Province save(Province province) {
        return provinceDao.save(province);
    }

    @Override
    public List<Province> findAll() {
        return provinceDao.findAll();
    }

    @Override
    public Province findOne(Long id) {
        return provinceDao.findOne(id);
    }

    @Override
    public Province findByUuid(String uuid) {
        return provinceDao.findByUuid(uuid);
    }

    @Override
    public Province findByMohccUuid(String mohccUuid) {
        return provinceDao.findByMohccUuid(mohccUuid);
    }

}
