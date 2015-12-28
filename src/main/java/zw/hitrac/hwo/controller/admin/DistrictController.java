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
import zw.hitrac.hwo.domain.Province;
import zw.hitrac.hwo.service.DistrictService;
import zw.hitrac.hwo.service.ProvinceService;

/**
 *
 * @author Daniel Nkhoma
 */
@Controller
public class DistrictController {

    @Autowired
    private DistrictService districtService;
    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Collection<Province> getProvinces() {
        return provinceService.findAll();
    }

    @RequestMapping(value = "/districts", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("districts", districtService.findAll());
        return "admin/districtListPage";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/districts/district")
    public String showform(Model model, @RequestParam(required = false, value = "id") Long id) {
        District district;
        if (id == null) {
            district = new District();
        } else {
            district = districtService.findOne(id);
        }
        model.addAttribute("district", district);

        return "admin/districtEditPage";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/districts/district")
    public String form(@Valid District district, BindingResult result, Model model) {
        districtService.save(district);
        return "redirect:/districts";
    }
}
