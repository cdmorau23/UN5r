package com.UN5.market.persistence;

import com.UN5.market.domain.Admin;
import com.UN5.market.domain.Rest;
import com.UN5.market.domain.repository.AdRepository;
import com.UN5.market.persistence.crud.AdminCrudRepository;
import com.UN5.market.persistence.entity.Administrador;
import com.UN5.market.persistence.entity.Restaurante;
import com.UN5.market.persistence.jpa.AdminJpaRepository;
import com.UN5.market.persistence.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class AdministradorRepository implements AdRepository {

    @Autowired
    private AdminCrudRepository adminCrudRepository;
    @Autowired
    private AdminJpaRepository adminJpaRepository;
    @Autowired
    private AdminMapper mapper;



    @Override
    public Admin getAdmin(int adminId){
        return mapper.toAdmin(adminJpaRepository.getOne(adminId));
    }

    @Override
    public int save(Admin admin){
        int res=0;
        Administrador administrador = adminJpaRepository.save(mapper.toAdministrador(admin));
        if(administrador.equals(null)){
            res= 1;
        }
        return res;
    }

    @Override
    public void delete(int adminId){
        adminCrudRepository.deleteById(adminId);
    }

    @Override
    public void updateAdmin(int adminId, String name, String email, String password) {
        adminJpaRepository.updateAdmin(name,email,password,adminId);
    }


}
