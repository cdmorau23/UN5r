package com.UN5.market.persistence.entity;
import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class AdminRestaurantePK implements Serializable {
    @Column(name = "Admin_id_admin")
    private Integer idAdmin;

    @Column(name = "RESTAURANTE_id_Restaurante")
    private Integer idRestaurante;

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Integer getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Integer idRestaurante) {
        this.idRestaurante = idRestaurante;
    }
}