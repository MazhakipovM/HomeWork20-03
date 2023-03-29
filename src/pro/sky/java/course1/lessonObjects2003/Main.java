package pro.sky.java.course1.lessonObjects2003;

public class Main {
    public static void main(String[] args) {

        Author FirstAuthor = new Author(" Автор первой книги. ");
        Book FirstBook = new Book("Первая книга. ",FirstAuthor, 2000);


        System.out.println(FirstBook.getBook() + FirstBook.getPublicationYear() + FirstAuthor.getName());

        Author SecondAuthor = new Author(" Автор второй книги. ");
        Book SecondBook = new Book("Вторая книга. ",SecondAuthor, 2022);


        System.out.println(SecondBook.getBook() + SecondBook.getPublicationYear() + SecondAuthor.getName());

        FirstBook.setPublicationYear(1995);
        System.out.println(FirstBook.getBook() + FirstBook.getPublicationYear() + FirstAuthor.getName());




    }
}