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
    public Admin save(Admin admin){
        Administrador administrador = mapper.toAdministrador(admin);
        return mapper.toAdmin(adminCrudRepository.save(administrador));

    }
    @Override
    public void delete(int adminId){
        adminCrudRepository.deleteById(adminId);
    }




}
