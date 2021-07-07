package com.UN5.market.persistence.jpa;

import com.UN5.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ProductoJpaRepository extends JpaRepository <Producto, Integer> {

    @Modifying()
    @Query(value = "UPDATE productos SET nombre =:name, descripcion =:description, precio_venta =:price, cantidad_stock =:stock WHERE id_producto =:productoid", nativeQuery=true)
    @Transactional
    void updateRest(@Param("name") String name, @Param("description") String description, @Param("price") double price, @Param("stock") int stock, @Param("productoid") int productId);

}
