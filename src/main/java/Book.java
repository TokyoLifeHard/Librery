public class Book {
    private String id_of_book;
    private String name_of_book;
    private String date_of_create;
    private String autorName;
    private String id_autor;
    private String id_type;

    @Override
    public String toString() {
        return "Book{" +
                "name_of_book='" + name_of_book + '\'' +
                ", date_of_create='" + date_of_create + '\'' +
                ", autorName='" + autorName + '\'' +
                '}';
    }

    public String getAutorName() {
        return autorName;
    }

    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }

    public String getId_of_book() {
        return id_of_book;
    }

    public void setId_of_book(String id_of_book) {
        this.id_of_book = id_of_book;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }

    public String getDate_of_create() {
        return date_of_create;
    }

    public void setDate_of_create(String date_of_create) {
        this.date_of_create = date_of_create;
    }

    public String getId_autor() {
        return id_autor;
    }

    public void setId_autor(String id_autor) {
        this.id_autor = id_autor;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public Book(String id_of_book, String name_of_book, String date_of_create, String id_autor, String id_type) {
        this.id_of_book = id_of_book;
        this.name_of_book = name_of_book;
        this.date_of_create = date_of_create;
        this.id_autor = id_autor;
        this.id_type = id_type;
    }

    public Book(String name_of_book, String date_of_create) {
        this.name_of_book = name_of_book;
        this.date_of_create = date_of_create;
    }

    public Book(String name_of_book, String date_of_create, String autorName) {
        this.name_of_book = name_of_book;
        this.date_of_create = date_of_create;
        this.autorName = autorName;
    }
}
