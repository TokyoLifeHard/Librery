public class Autor {
    private String id_autor;
    private String autorName;

    @Override
    public String toString() {
        return "Autor{" +
                "id_autor=" + id_autor +
                ", autorName='" + autorName + '\'' +
                '}';
    }

    public String getId_autor() {
        return id_autor;
    }

    public void setId_autor(String id_autor) {
        this.id_autor = id_autor;
    }

    public String getAutorName() {
        return autorName;
    }

    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }

    public Autor(String id_autor, String autorName) {
        this.id_autor = id_autor;
        this.autorName = autorName;
    }
}
