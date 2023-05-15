package view;
import model.Book;
import controller.BooksController;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleView {

    public static void main(String [] args){
        new ConsoleView();

    }
    Scanner scanner = new Scanner(System.in);
        public ConsoleView() {
            askWhatToDo();
        }

        private void showBook(Book book) {

            System.out.println(book.getTitulo());
            System.out.println(book.getAutor());
            System.out.println(book.getCategoria());
            System.out.println(book.getDisponibilidad());
        }

        public void showListOfBooks (ArrayList < Book > allBooks) {
            for (Book object : allBooks) {
                System.out.println(object.getTitulo());
            }
        }
        private void askWhatToDo() {
            boolean seguir = true;
            while (seguir) {
                int indiceLibro = 0;
                ArrayList<Book> listaBooks = BooksController.getBooks();
                int opcion = 0;
                String titulo;
                String disponibilidad;

                System.out.println("Que desea hacer: ");
                System.out.println("1. Buscar libro      2. Comprar Libro.\n3. Actualizar disponibilidad libro.");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:

                        System.out.println("Libro a buscar: ");
                        titulo = scanner.nextLine();
                        BooksController.searchBook(titulo);
                        System.out.println("Libro encontrado!");
                        break;
                    case 2:
                        System.out.println("Que libro desea comprar: ");
                        showListOfBooks(listaBooks);
                        indiceLibro = scanner.nextInt();
                        System.out.println(listaBooks.get(indiceLibro).getDisponibilidad());
                        break;
                    case 3:


                        System.out.println("Que libro desea actualizar: ");
                        showListOfBooks(listaBooks);
                        indiceLibro = scanner.nextInt();
                        System.out.println("Estado:"+listaBooks.get(indiceLibro).getDisponibilidad());
                        System.out.println("Nueva disponibilidad : -------------------");
                        disponibilidad = scanner.nextLine();

                        BooksController.updateAviability(listaBooks.get(indiceLibro).getTitulo() , disponibilidad);

                        break;
                    default:
                        seguir=false;
                        break;
                }

            }


        }
    }

