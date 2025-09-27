package com.example.miprimerfragment;

import java.util.ArrayList;

public class GestorCarroCompra {
    private static GestorCarroCompra instancia;
    private ArrayList<Libro> carroCompra;

    private GestorCarroCompra() {
        carroCompra = new ArrayList<>();
    }

    public static synchronized GestorCarroCompra getInstancia() {
        if (instancia == null) {
            instancia = new GestorCarroCompra();
        }
        return instancia;
    }

    public ArrayList<Libro> getCarroCompra() {
        return carroCompra;
    }

    public void agregarAlCarro(Libro libro) {
        if (!carroCompra.contains(libro)) {
            carroCompra.add(libro);
        }
    }

    public void eliminarDelCarro(Libro libro) {
        carroCompra.remove(libro);
    }

    public void limpiarCarro() {
        carroCompra.clear();
    }

    public int getCantidadLibros() {
        return carroCompra.size();
    }
}