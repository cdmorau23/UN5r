package com.UN5.market.domain.service;

import com.UN5.market.domain.Rest;
import com.UN5.market.domain.repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestService {
    @Autowired
    private RestRepository restRepository;

    public Rest getRest(int restId){
        return restRepository.getRest(restId);
    }


    public Rest save(Rest rest){
        return restRepository.save(rest);
    }

    public List<Rest> getByAdmin(int adminId) {return restRepository.adminRests(adminId);}
}
