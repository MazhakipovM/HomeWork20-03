package pro.sky.java.course1.lessonObjects2003;

public class Book {

    private Author author;

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

    public Author getAuthor(){
        return this.author;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    //task
    public String toString() {
        return getBook() + getPublicationYear()+ getAuthor();
    }

    public int hashCode() {
        return java.util.Objects.hash(this.book,this.author,this.publicationYear);
    }


    public boolean equals(Book other){
        if (this.book.equals(other.book) && this.author.equals(other.author) && this.publicationYear==other.publicationYear) {
            return true;
        }else {
            return false;
        }
    }




}


