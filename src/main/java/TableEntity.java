public class TableEntity {
    private String numofrow;
    private String autor;
    private String name_of_book;
    private String type;
    private String date_of_create;
    private String real_count_books;
    private String books_on_the_hands;
    private String all_count_books;

    public TableEntity(){}

    public TableEntity(String numofrow, String autor, String name_of_book, String type, String date_of_create, String real_count_books, String books_on_the_hands, String all_count_books) {
        this.numofrow = numofrow;
        this.autor = autor;
        this.name_of_book = name_of_book;
        this.type = type;
        this.date_of_create = date_of_create;
        this.real_count_books = real_count_books;
        this.books_on_the_hands = books_on_the_hands;
        this.all_count_books = all_count_books;
    }

    @Override
    public String toString() {
        return "TableEntity{" +
                "numofrow='" + numofrow + '\'' +
                ", autor='" + autor + '\'' +
                ", name_of_book='" + name_of_book + '\'' +
                ", type='" + type + '\'' +
                ", date_of_create='" + date_of_create + '\'' +
                ", real_count_books='" + real_count_books + '\'' +
                ", books_on_the_hands='" + books_on_the_hands + '\'' +
                ", all_count_books='" + all_count_books + '\'' +
                '}';
    }

    public String getBooks_on_the_hands() {
        return books_on_the_hands;
    }

    public void setBooks_on_the_hands(String books_on_the_hands) {
        this.books_on_the_hands = books_on_the_hands;
    }

    public String getAll_count_books() {
        return all_count_books;
    }

    public void setAll_count_books(String all_count_books) {
        this.all_count_books = all_count_books;
    }

    public String getNumofrow() {
        return numofrow;
    }

    public void setNumofrow(String numofrow) {
        this.numofrow = numofrow;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_of_create() {
        return date_of_create;
    }

    public void setDate_of_create(String date_of_create) {
        this.date_of_create = date_of_create;
    }

    public String getReal_count_books() {
        return real_count_books;
    }

    public void setReal_count_books(String real_count_books) {
        this.real_count_books = real_count_books;
    }
}
