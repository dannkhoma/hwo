/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.hitrac.hwo.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zw.hitrac.hwo.dao.ProvinceDao;
import zw.hitrac.hwo.domain.Province;
import zw.hitrac.hwo.repository.ProvinceRepository;

/**
 *
 * @author Daniel Nkhoma
 */
@Repository
public class ProvinceDaoImpl implements ProvinceDao {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findOne(Long id) {
        return provinceRepository.findOne(id);

    }

    @Override
    public Province findByUuid(String uuid) {
        return provinceRepository.findByUuid(uuid);

    }

    @Override
    public Province findByMohccUuid(String mohccUuid) {
        return provinceRepository.findByMohccUuid(mohccUuid);
    }

}
