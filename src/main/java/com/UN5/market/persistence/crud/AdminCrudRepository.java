package com.UN5.market.persistence.crud;

import com.UN5.market.domain.Admin;
import com.UN5.market.persistence.entity.Administrador;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface AdminCrudRepository extends CrudRepository<Administrador,Integer> {

}
