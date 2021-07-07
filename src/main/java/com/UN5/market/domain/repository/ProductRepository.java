package com.UN5.market.domain.repository;

import com.UN5.market.domain.Product;
import com.UN5.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    List<Product> getByRest(int restId);
    Product getProduct(int productId);
    Product save(Product product);
    String delete(int productId);


    /*metodos necesarios:
    - dado cierto restaurante obtener la lista de productos asociados a este
    - dado cierto nombre obtener la lista de productos con ese nombre y asociados al restaurante
    - insertar un nuevo producto dentro del restaurante dando los datos correspondientes, uso en el menu de agregar producto
    - modificar producto dados los datos correspondientes, uso en el menu de detalles producto funcionalidad actualizar producto
    - eliminar producto, uso en el menu de detalles producto funcionalidad eliminar producto
     */
}
