package com.UN5.market.persistence.jpa;

import com.UN5.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoJpaRepository extends JpaRepository <Producto, Integer> {
}
