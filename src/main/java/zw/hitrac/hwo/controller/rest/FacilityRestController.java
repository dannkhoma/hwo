package zw.hitrac.hwo.controller.rest;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zw.hitrac.hwo.domain.Facility;
import zw.hitrac.hwo.service.FacilityService;

/**
 *
 * @author Daniel Nkhoma
 */
@RestController
public class FacilityRestController {

    @Autowired
    private FacilityService facilityService;

    @RequestMapping(value = "/facilities/facility/save", method = RequestMethod.POST)
    public Facility createNewHwoFacility(@RequestBody @Valid final Facility facility) {
        return facilityService.save(facility);
    }

    @RequestMapping("/facilities/facility/get_facility")
    public Facility findHwoFacilityByMohccFacilityId(@RequestParam(required = true, value = "facility_id") String facility_id) {
        Facility facility = facilityService.findByMohccUuid(facility_id);
        return facility;
    }
}
