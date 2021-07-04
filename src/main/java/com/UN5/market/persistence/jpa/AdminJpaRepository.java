package com.UN5.market.persistence.jpa;

import com.UN5.market.persistence.entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJpaRepository extends JpaRepository<Administrador, Integer> {
}
