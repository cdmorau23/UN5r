package com.UN5.market.persistence.jpa;

import com.UN5.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductoJpaRepository extends JpaRepository <Producto, Integer> {

    List<Producto> findByIdRestauranteOrderByNombreAsc(int idRestaurante);

    @Query(value = "DELETE FROM public.compras_productos " +
            "WHERE id_producto =:idproducto;\n " +
            "DELETE FROM public.productos " +
            "WHERE id_producto =:idproducto;", nativeQuery=true)
    @Transactional
    void removeProducto(@Param("idproducto") int productoId);


    @Query(value = "DELETE FROM public.productos " +
            "WHERE restaurante_id_restaurante =:idrestaurante;", nativeQuery=true)
    @Transactional
    void removeProductoByRestaurante(@Param("idrestaurante") int restauranteId);

}
