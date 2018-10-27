public class Book_on_hadn {
    int id_student;
    int id_book;
    int id_book_instace;

    public int getId_student() {
        return id_student;
    }

    @Override
    public String toString() {
        return "Book_on_hadn{" +
                "id_student=" + id_student +
                ", id_book=" + id_book +
                ", id_book_instace=" + id_book_instace +
                '}';
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public int getId_book_instace() {
        return id_book_instace;
    }

    public void setId_book_instace(int id_book_instace) {
        this.id_book_instace = id_book_instace;
    }

    public Book_on_hadn(int id_student, int id_book, int id_book_instace) {
        this.id_student = id_student;
        this.id_book = id_book;
        this.id_book_instace = id_book_instace;
    }
}
