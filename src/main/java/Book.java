public class Book {
   private int id_of_book;
   private String name_of_book;
   private String date_of_create;
   private int id_autor;
   private int id_type;

    @Override
    public String toString() {
        return "Book{" +
                "id_of_book=" + id_of_book +
                ", name_of_book='" + name_of_book + '\'' +
                ", date_of_create='" + date_of_create + '\'' +
                ", id_autor=" + id_autor +
                ", id_type=" + id_type +
                '}';
    }

    public Book(int id_of_book, String name_of_book, String date_of_create, int id_autor, int id_type) {
        this.id_of_book = id_of_book;
        this.name_of_book = name_of_book;
        this.date_of_create = date_of_create;
        this.id_autor = id_autor;
        this.id_type = id_type;
    }

    public void setId_of_book(int id_of_book) {
        this.id_of_book = id_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }

    public void setDate_of_create(String date_of_create) {
        this.date_of_create = date_of_create;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public int getId_of_book() {
        return id_of_book;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public String getDate_of_create() {
        return date_of_create;
    }

    public int getId_autor() {
        return id_autor;
    }

    public int getId_type() {
        return id_type;
    }
}
