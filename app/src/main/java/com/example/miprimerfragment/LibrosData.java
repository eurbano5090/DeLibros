package com.example.miprimerfragment;

import java.util.ArrayList;
import java.util.List;

public class LibrosData {
    private static LibrosData instance;
    private List<Libro> libros;

    private LibrosData() {
        libros = crearLibrosDePrueba();
    }

    public static LibrosData getInstance() {
        if (instance == null) {
            instance = new LibrosData();
        }
        return instance;
    }

    public List<Libro> getLibros() {
        return libros;
    }
    public Libro getLibroById(int id) {
        for (Libro libro : libros) {
            if (libro.getIdTitulo() == id) {
                return libro;
            }
        }
        return null;
    }

        public static List<Libro> crearLibrosDePrueba() {
            List<Libro> libros = new ArrayList<>();

            // Libro(int idTitulo, String titulo, String descripcion, int imagenResourceId, String categoria)
            libros.add(new Libro(1, "El Señor de los Anillos", "Una épica aventura en la Tierra Media.", R.drawable.esdla, "Fantasía"));
            libros.add(new Libro(2, "Cien Años de Soledad", "La historia de la familia Buendía en Macondo.", R.drawable.cads ,"Realismo Mágico"));
            libros.add(new Libro(3, "Dune", "Una lucha por el control del planeta desértico Arrakis.", R.drawable.dune, "Ciencia Ficción"));
            libros.add(new Libro(4, "1984", "Una distopía sobre un futuro totalitario.", R.drawable.mnoc, "Distopía"));
            libros.add(new Libro(13, "Ilusiones", "Historia de un maestro que busca cambiar tu vida", R.drawable.img3, "Novela Filosófica"));
            libros.add(new Libro(14, "El Buzón de las Impuras", "Tragedia que ocurre en Santiago 1863", R.drawable.img1, "Novela Historica"));
            libros.add(new Libro(15, "El Canto del Cuco", "Historia de la busqueda de una mujer desaparecida", R.drawable.img2, "Novela Policíaca"));
            libros.add(new Libro(6, "Fahrenheit 451", "Como la sociedad basa sus cimientos en el manejo de la informacion", R.drawable.fccu, "Ciencia Ficción"));

            return libros;
        }

}
