package com.UN5.market.persistence.jpa;

import com.UN5.market.persistence.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteJpaRepository extends JpaRepository<Restaurante, Integer> {
}
