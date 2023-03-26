package pro.sky.java.course1.lessonObjects2003;

import com.sun.source.doctree.AuthorTree;

public class Main {
    public static void main(String[] args) {

        Author FirstAuthor = new Author(" Автор первой книги. ");
        Book FirstBook = new Book("Первая книга. ", 2000);


        System.out.println(FirstBook.getBook() + FirstBook.getPublicationYear() + FirstAuthor.getAuthorsName());

        Author SecondAuthor = new Author(" Автор второй книги. ");
        Book SecondBook = new Book("Вторая книга. ", 2022);


        System.out.println(SecondBook.getBook() + SecondBook.getPublicationYear() + SecondAuthor.getAuthorsName());

        FirstBook.setPublicationYear(1995);
        System.out.println(FirstBook.getBook() + FirstBook.getPublicationYear() + FirstAuthor.getAuthorsName());




    }
}