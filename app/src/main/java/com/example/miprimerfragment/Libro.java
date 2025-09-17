package com.example.miprimerfragment;

public class Libro {

    private int idTitulo;
    private String titulo;

    private String detalle;
    private String descripcion;
    private int imagenResourceId;
    private String categoria;

    public Libro() {
    }

    public Libro(int idTitulo, String titulo, String descripcion, int imagenResourceId, String categoria,String detalle) {
        this.idTitulo = idTitulo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenResourceId = imagenResourceId;
        this.categoria = categoria;
        this.detalle = detalle;
    }


    public int getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(int idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagenResourceId() {
        return imagenResourceId;
    }

    public void setImagenResourceId(int imagenResourceId) {
        this.imagenResourceId = imagenResourceId;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDetalle() {
        return detalle;
    }
}
