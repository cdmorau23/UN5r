package com.UN5.market.persistence.jpa;

import com.UN5.market.persistence.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface RestauranteJpaRepository extends JpaRepository<Restaurante, Integer> {
    @Modifying()
    @Query(value = "UPDATE restaurante SET nombre =:name, slogan =:slogan, total_mesas =:tabletotal WHERE id_restaurante =:restid", nativeQuery=true)
    @Transactional
    void updateRest(@Param("name") String name, @Param("slogan") String slogan, @Param("tabletotal") int tableTotal, @Param("restid") int restId);

    @Query(value = "DELETE FROM public.restaurante " +
            "WHERE id_restaurante =:idrestaurante;", nativeQuery=true)
    @Transactional
    void removeRestaurante(@Param("idrestaurante") int RestauranteId);

}
