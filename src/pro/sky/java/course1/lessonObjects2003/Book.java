package pro.sky.java.course1.lessonObjects2003;

public class Book {

    public Author author;

    private String book;

    private int publicationYear;

    public Book  (String book,Author author, int publicationYear ) {

        this.book =book;
        this.author = author;
        this.publicationYear = publicationYear;
    }


    public String getBook(){
        return this.book;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }


    public Author getAuthor(){
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    }
