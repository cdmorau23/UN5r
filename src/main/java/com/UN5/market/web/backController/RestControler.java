package com.UN5.market.web.backController;

import com.UN5.market.domain.Rest;
import com.UN5.market.domain.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Rest")
public class RestControler {
    @Autowired
    private RestService restService;

    @GetMapping("/{Rest}")
    public Rest getRest(@PathVariable("Rest") int RID){
        return restService.getRest(RID);
    }

    @GetMapping("/id/{AdminId}")
    public List<Rest> getByAdmin(@PathVariable("AdminId") int adminId){
        return restService.getByAdmin(adminId);
    }

    @PostMapping("/save")
    public ResponseEntity<Rest> save(@RequestBody Rest rest){
        return new ResponseEntity<>(restService.save(rest), HttpStatus.CREATED);
    }
}
