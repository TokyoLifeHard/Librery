public class Type {
    private String id_type;
    private String type_of_the_book;

    @Override
    public String toString() {
        return "Type{" +
                "id_type=" + id_type +
                ", type_of_the_book='" + type_of_the_book + '\'' +
                '}';
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public String getType_of_the_book() {
        return type_of_the_book;
    }

    public void setType_of_the_book(String type_of_the_book) {
        this.type_of_the_book = type_of_the_book;
    }

    public Type(String id_type, String type_of_the_book) {
        this.id_type = id_type;
        this.type_of_the_book = type_of_the_book;
    }
}
