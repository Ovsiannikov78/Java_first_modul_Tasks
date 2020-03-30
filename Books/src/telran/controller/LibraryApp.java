package telran.controller;
import telran.dao.Library;
import telran.data.Book;

import java.util.Scanner;

public class LibraryApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Book book1 = new Book ("Winnie the Pooh", "Alex Milan", 350, 1957);
        Book book2 = new Book ("Harry Potter", "Joan Rollings", 435, 2010);
        Book book3 = new Book ("Sherlock Holms", "Artur Conan Doyle", 388, 1892);
        Book book4 = new Book ("War and Peace 1","Lev Tolstoy", 968, 1886 );
        Book book5 = new Book ("Capital", "Karl Marx", 1200, 1867);
        Book book6 = new Book("Confessions of an Economic Hit Man", "John Perkins", 250, 2004);
        Book book7 = new Book ("Java 8 - Beginner's Guide", "Herbert Schildt", 720, 2015 );
        Book book8 = new Book("Трансерфинг реальности. Часть I: Пространство вариантов", "Вадим Зеланд", 224, 2007);

        Library myLab = new Library(100);
        myLab.addBook(book1);
        myLab.addBook(book2);
        myLab.addBook(book3);
        myLab.addBook(book4);
        myLab.addBook(book5);
        myLab.addBook(book6);
        myLab.addBook(book7);
        myLab.addBook(book8);

       // myLab.display();
       /* myLab.deleteBook(book4);

        System.out.println();
        myLab.display();

        System.out.println();
        myLab.searchBookByAuthor("Vasya");
        System.out.println(); */


        myLab.findBook(userBook());   // поиск книги через ввод данных с клавиатуры
        //myLab.findBook(book8);// ДОМАШКА

    }
   public static String getUserTitle() {
        System.out.println("Hi. Please, enter the title of your book: ");
        String newTitle = scanner.nextLine();
        return newTitle;
    }
    public static String getUserAuthor() {
        System.out.println("Please, enter the author of your book: ");
        String author = scanner.nextLine();
        return author;
    }
    public static int getUserPages() {
        System.out.println("Please, enter the number of pages of your book: ");
        int pages = scanner.nextInt();
        return pages;
    }
    public static int getUserdateOfIssue(){
        System.out.println("Please, enter the dateOfIssue of your book: ");
        int dateOfIssue = scanner.nextInt();
        return dateOfIssue;

    }
   public static Book userBook(){
        Book userBook1 = new Book(getUserTitle(),getUserAuthor(),getUserPages(),getUserdateOfIssue());
        return userBook1;
       /*getUserTitle();
        getUserAuthor();
        getUserPages();
        getUserdateOfIssue();*/
    }

}