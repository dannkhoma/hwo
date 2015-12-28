package zw.hitrac.hwo.controller.rest;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zw.hitrac.hwo.domain.Province;
import zw.hitrac.hwo.service.ProvinceService;

/**
 *
 * @author Daniel Nkhoma
 */
@RestController
public class ProvinceRestController {

    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(value = "/provinces/province/save", method = RequestMethod.POST)
    public Province createNewHwoProvince(@RequestBody @Valid final Province province) {
        return provinceService.save(province);
    }

    @RequestMapping("/provinces/province/get_province")
    public Province findHwoProvinceByMohccProvinceId(@RequestParam(required = true, value = "province_id") String province_id) {
        Province province = provinceService.findByMohccUuid(province_id);
        return province;
    }
}
