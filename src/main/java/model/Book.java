package model;

public class Book {
    private String titulo;
    private String autor;
    private String categoria;
    private String disponibilidad;

    public Book(String titulo,String autor,String categoria,String disponibilidad) {

        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;

    }

    public String getTitulo() {
        return titulo;
    }

    public boolean setTitulo(String titulo) {
        this.titulo = titulo;
        return true;
    }

    public String getAutor() {
        return autor;
    }

    public boolean setAutor(String autor) {
        this.autor = autor;
        return true;

    }

    public String getCategoria() {
        return categoria;
    }

    public boolean setCategoria(String categoria) {
        this.categoria = categoria;
        return true;

    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public boolean setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
        return true;

    }
}
