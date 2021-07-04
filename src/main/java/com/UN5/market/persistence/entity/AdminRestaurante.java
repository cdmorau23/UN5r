package com.UN5.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "Admin_has_RESTAURANTE")
public class AdminRestaurante {

        @EmbeddedId
        private AdminRestaurantePK id;


        @ManyToOne
        @JoinColumn(name = "Admin_id_admin", insertable = false, updatable = false)
        private Administrador administrador;

        @ManyToOne
        @JoinColumn(name = "RESTAURANTE_id_Restaurante", insertable = false, updatable = false)
        private Restaurante restaurante;

        public void setId(AdminRestaurantePK id) {
                this.id = id;
        }

        public AdminRestaurantePK getId() {
                return id;
        }


        public Administrador getAdministrador() {
                return administrador;
        }

        public void setAdministrador(Administrador administrador) {
                this.administrador = administrador;
        }

        public Restaurante getRestaurante() {
                return restaurante;
        }

        public void setRestaurante(Restaurante restaurante) {
                this.restaurante = restaurante;
        }
}