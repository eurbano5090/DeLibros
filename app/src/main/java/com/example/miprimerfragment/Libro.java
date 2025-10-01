package com.example.miprimerfragment;

import java.io.Serializable;
import java.util.Objects;

/*
// Enviar Lista en el Intent:
    intent.putExtra("lista_libros", listaLibros);
// Recibir:
    ArrayList<Libro> libros = (ArrayList<Libro>) getIntent().getSerializableExtra("lista_libros");
 */
public class Libro implements Serializable {
    // Atributos
    private String nombre;
    private String autor;
    private String imagen; // Se usa String para representar la ruta o URL de la imagen
    private String idioma;
    private String descripcion;
    private int paginas;
    private int edicion;
    private int precio;
    private String isbn;

    // Constructor con todos los parámetros
    public Libro(String nombre, String autor, String imagen, String idioma,
                 String descripcion, int paginas, int edicion, int precio, String isbn) {
        setNombre(nombre);
        setAutor(autor);
        setImagen(imagen);
        setIdioma(idioma);
        setDescripcion(descripcion);
        setPaginas(paginas);
        setEdicion(edicion);
        setPrecio(precio);
        setIsbn(isbn);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Libro libro = (Libro) obj;
        return Objects.equals(isbn, libro.isbn); // El ISBN es único para cada libro
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getImagen() {
        return imagen;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public int getPrecio() {
        return precio;
    }

    public String getIsbn() {
        return isbn;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}