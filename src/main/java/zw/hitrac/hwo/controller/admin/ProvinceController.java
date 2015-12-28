package zw.hitrac.hwo.controller.admin;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import zw.hitrac.hwo.domain.Province;
import zw.hitrac.hwo.service.ProvinceService;

/**
 *
 * @author Daniel Nkhoma
 */
@Controller
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(value = "/provinces", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("provinces", provinceService.findAll());
        return "admin/provinceListPage";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/provinces/province")
    public String showform(Model model, @RequestParam(required = false, value = "id") Long id) {
        Province province;
        if (id == null) {
            province = new Province();
        } else {
            province = provinceService.findOne(id);
        }
        model.addAttribute("province", province);

        return "admin/provinceEditPage";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/provinces/province")
    public String form(@Valid Province province, BindingResult result, Model model) {
        provinceService.save(province);
        return "redirect:/provinces";
    }

}
