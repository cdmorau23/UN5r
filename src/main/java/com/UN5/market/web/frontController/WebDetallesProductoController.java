package com.UN5.market.web.frontController;

import com.UN5.market.domain.Admin;
import com.UN5.market.domain.Product;
import com.UN5.market.domain.Rest;
import com.UN5.market.domain.service.AdService;
import com.UN5.market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class WebDetallesProductoController {

    @Autowired
    private com.UN5.market.domain.service.RestService restService;

    @Autowired
    private AdService adService;

    @Autowired
    private com.UN5.market.domain.service.ProductService productService;

    @GetMapping("/productoDetalles.html/{AdminId}/{RestId}/{ProductId}")
    public String productoDetallesAdmin(@PathVariable("RestId") int restId, @PathVariable("AdminId") int adminId, @PathVariable("ProductId") int productId, Model model){
        Admin usuario = adService.getAdministrador(adminId);
        Rest restaurante = restService.getRest(restId);
        Product producto = productService.getProduct(productId);
        model.addAttribute("usuario",usuario);
        model.addAttribute("restaurante", restaurante);
        model.addAttribute("producto",producto);
        return "productoDetalles";
    }



    @ModelAttribute("producto")
    public Product product(){
        return new Product();
    }

}
