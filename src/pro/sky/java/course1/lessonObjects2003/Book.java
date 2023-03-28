package pro.sky.java.course1.lessonObjects2003;

public class Book {

    private String book;

  // public String Author;

    private int publicationYear;

    public Book  (String book,int publicationYear) {
        this.book =book;
        this.publicationYear = publicationYear;
    }

    public String getBook(){
        return this.book;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    }
