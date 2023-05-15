package controller;

import model.Book;

import java.util.ArrayList;

public class BooksController {

    static ArrayList<Book> books = new ArrayList<Book>();

    public BooksController(){

    }

    public static boolean searchBook(String title){

        for(Book bookToFind : books){
            bookToFind.getTitulo().equals(title);
            return true;

        }
        return false;
    }

    public static ArrayList<Book> getBooks(){
        return books;
    }

    public static boolean buyBook(String title){
        for(Book bookToFind : books){
            if(bookToFind.getTitulo().equals(title)){
                books.remove(bookToFind);
            }
            return true;

        }
        return true;
    }

    public static boolean updateAviability(String title,String disponibilidad){
        for(Book bookToFind : books){
            if(bookToFind.getTitulo().equals(title)){
                bookToFind.setDisponibilidad(disponibilidad);
            }

            return true;

        }
        return false;
    }





}
