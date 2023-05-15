package model;
import model.Book;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BookTest {
    private Book book;

    @BeforeEach

    void setUp() {
        book = new Book("HolaUsuario", "soy yo", "analisis", "disponible");
    }

    @Test
    void setTituloTest() {
        Assertions.assertEquals(true, book.setTitulo("soy un libro feliz"));
    }

    @Test
    void getTituloTest() {
        Assertions.assertEquals("HolaUsuario", book.getTitulo());
    }

    @Test
    void setAutorTest() {
        Assertions.assertEquals(true, book.setAutor("HolaOtraVez"));
    }
    @Test
    void getAutorTest() {
        Assertions.assertEquals("soy yo", book.getAutor());
    }
    @Test
    void setCategoriaTest() {
        Assertions.assertEquals(true, book.setCategoria("perros"));
    }
    @Test
    void getCategoriaTest() {
        Assertions.assertEquals("analisis", book.getCategoria());
    }

    @Test
    void setDisponibilidadTest(){
        Assertions.assertEquals(true, book.setDisponibilidad("GUAA"));
    }
    @Test
    void getDisponibilidadTest() {
        Assertions.assertEquals("disponible", book.getDisponibilidad());
    }

}