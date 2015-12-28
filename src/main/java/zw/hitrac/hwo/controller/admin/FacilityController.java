package zw.hitrac.hwo.controller.admin;

import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import zw.hitrac.hwo.domain.District;
import zw.hitrac.hwo.domain.Facility;
import zw.hitrac.hwo.service.DistrictService;
import zw.hitrac.hwo.service.FacilityService;

/**
 *
 * @author hitrac
 */
@Controller
public class FacilityController {

    @Autowired
    private FacilityService facilityService;
    @Autowired
    private DistrictService districtService;

    @ModelAttribute("districts")
    public Collection<District> getDistricts() {
        return districtService.findAll();
    }

    @RequestMapping(value = "/facilities", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("facilities", facilityService.findAll());
        return "admin/facilityListPage";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/facilities/facility")
    public String showform(Model model, @RequestParam(required = false, value = "id") Long id) {
        Facility facility;
        if (id == null) {
            facility = new Facility();
        } else {
            facility = facilityService.findOne(id);
        }
        model.addAttribute("facility", facility);

        return "admin/facilityEditPage";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/facilities/facility")
    public String form(@Valid Facility facility, BindingResult result, Model model) {
        facilityService.save(facility);
        return "redirect:/facilities";
    }

}
