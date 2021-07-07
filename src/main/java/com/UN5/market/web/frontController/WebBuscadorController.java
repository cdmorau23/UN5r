package com.UN5.market.web.frontController;

import com.UN5.market.domain.Admin;
import com.UN5.market.domain.Rest;
import com.UN5.market.domain.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class WebBuscadorController {

    @Autowired
    private com.UN5.market.domain.service.RestService RestService;

    @Autowired
    private AdService adService;

    @GetMapping("/restaurantesBuscador.html/{AdminId}")
    public String restaurantesAdminBuscador(@PathVariable("AdminId") int adminId, Model model) {
        List<Rest> restaurantes = RestService.getByAdmin(adminId);
        Admin usuario = adService.getAdministrador(adminId);
        model.addAttribute("restaurantes", restaurantes);
        model.addAttribute("usuario",usuario);
        return "restaurantesBuscador";
    }

    @GetMapping ("/restauranteAgregarBuscador.html/{AdminId}")
    public String restauranteAgregarAdminBuscador(@PathVariable("AdminId") int adminId,Model model){
        Admin usuario = adService.getAdministrador(adminId);
        model.addAttribute("usuario",usuario);
        return "restauranteAgregarBuscador";
    }

}
