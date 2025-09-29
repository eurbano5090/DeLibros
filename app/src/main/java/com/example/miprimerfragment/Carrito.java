package com.example.miprimerfragment;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private static final List<ItemCarrito> items = new ArrayList<>();

    public static void agregarItem(int idTitulo, int cantidad) {

        for (ItemCarrito item : items) {
            if (item.getIdTitulo() == idTitulo) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }

        items.add(new ItemCarrito(idTitulo, cantidad));
    }

    public static List<ItemCarrito> getItems() {
        return items;
    }

    public static void vaciar() {
        items.clear();
    }

    public void eliminarItem(int idTitulo) {
        items.removeIf(item -> item.getIdTitulo() == idTitulo);
    }

    public static int total() {
        int total = 0;
        for (ItemCarrito item : items) {
            Libro libro = LibrosData.getInstance().getLibroById(item.getIdTitulo());
            if (libro != null) {
                total += libro.getPrecio() * item.getCantidad();
            }
        }
        return total;
    }
}
