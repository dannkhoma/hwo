package zw.hitrac.hwo.controller.rest;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zw.hitrac.hwo.domain.StaffEstablishment;
import zw.hitrac.hwo.service.StaffEstablishmentService;

/**
 *
 * @author Daniel Nkhoma
 */
@RestController
public class StaffEstablishmentRestController {

    @Autowired
    private StaffEstablishmentService staffEstablishmentService;

    @RequestMapping(value = "/staffEstablishments/staffEstablishment/save", method = RequestMethod.POST)
    public StaffEstablishment createNewHwoStaffEstablishment(@RequestBody @Valid final StaffEstablishment staffEstablishment) {
        return staffEstablishmentService.save(staffEstablishment);
    }

    @RequestMapping("/staffEstablishments/staffEstablishment/get_staffEstablishment/{staffEstablishment_id}")
    public StaffEstablishment findHwoStaffEstablishmentByMohccStaffEstablishmentId(@PathVariable String staffEstablishment_id) {
        StaffEstablishment staffEstablishment = staffEstablishmentService.findByMohccUuid(staffEstablishment_id);
        return staffEstablishment;
    }
}
