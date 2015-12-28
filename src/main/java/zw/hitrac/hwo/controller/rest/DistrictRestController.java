package zw.hitrac.hwo.controller.rest;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zw.hitrac.hwo.domain.District;
import zw.hitrac.hwo.service.DistrictService;

/**
 *
 * @author Daniel Nkhoma
 */
@RestController
public class DistrictRestController {

    @Autowired
    private DistrictService districtService;

    @RequestMapping(value = "/districts/district/save", method = RequestMethod.POST)
    public District createNewHwoDistrict(@RequestBody @Valid final District district) {
        return districtService.save(district);
    }

    @RequestMapping("/districts/district/get_district")
    public District findHwoDistrictByMohccDistrictId(@RequestParam(required = true, value = "district_id") String district_id) {
        District district = districtService.findByMohccUuid(district_id);
        return district;
    }
}
