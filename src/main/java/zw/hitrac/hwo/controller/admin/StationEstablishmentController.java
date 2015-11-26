
package zw.hitrac.hwo.controller.admin;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import zw.hitrac.hwo.domain.StationEstablishment;
import zw.hitrac.hwo.service.StationEstablishmentService;

/**
 *
 * @author Tonderai Ndangana
 */
public class StationEstablishmentController {
    
    
    
    @Autowired
    private StationEstablishmentService stationEstablishmentService;

    @RequestMapping(value = "/stationEstablishment", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("stationEstablishment", stationEstablishmentService.findAll());
        return "stationEstablishmentListPage";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/stationEstablishment/stationEstablishment")
    public String showform(Model model, @RequestParam(required = false, value = "id") Long id) {
        StationEstablishment stationEstablishment;
        if(id==null){
           stationEstablishment=new StationEstablishment();
        }else{
            stationEstablishment=stationEstablishmentService.findOne(id);
        }
        model.addAttribute("stationEstablishment",stationEstablishment );
        
        return "stationEstablishmentEditPage";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/stationEstablishment/stationEstablishment")
    public String form(@Valid StationEstablishment stationEstablishment,BindingResult result,Model model) {
        stationEstablishmentService.save(stationEstablishment);
        return "redirect:/stationEstablishment";
    }

    
    
    
    
}
