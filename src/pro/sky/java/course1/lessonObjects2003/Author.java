package pro.sky.java.course1.lessonObjects2003;

public class Author {

    private String name;

    public Author (String name){
      this.name = name;
    }


    public String getName(){
        return this.name;

    }

    public String toString() {
        return getName();
    }

    public int hashCode(){
        return java.util.Objects.hash(this.name);
    }
    public boolean equals(Author other) {
        if (this.name.equals(other.name)) {
            return true;
        }
        return false;
    }


}
