package com.example.miprimerfragment;

public class ItemCarrito {

        private int idTitulo;
        private int cantidad;

        public ItemCarrito(int idTitulo, int cantidad) {
            this.idTitulo = idTitulo;
            this.cantidad = cantidad;
        }

        public int getIdTitulo() {
            return idTitulo;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
    }

