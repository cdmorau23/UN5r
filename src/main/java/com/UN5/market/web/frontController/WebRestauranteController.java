package com.UN5.market.web.frontController;

import com.UN5.market.domain.Rest;
import com.UN5.market.persistence.RestauranteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class WebRestauranteController {
    private RestauranteRepository restRepository;

    @GetMapping("/restauranteAgregarBuscador.html/{AdminId}")
    public String showRegistrationform(){
        return "restauranteAgregarBuscador";
    }
    @PostMapping("/restauranteAgregarBuscador.html/{AdminId}")
    public  String registerRestaurante(@ModelAttribute("rest") Rest restaurante, @PathVariable("AdminId") int adminId){

        restRepository.save(restaurante);
        return "restauranteAgregarBuscador";
    }
    @ModelAttribute("rest")
    public Rest restaurante() {
        return new Rest();
    }
}

