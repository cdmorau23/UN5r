package com.UN5.market.persistence.jpa;

import com.UN5.market.persistence.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraJpaRepository extends JpaRepository<Compra,Integer> {
}
