public class Autor {
    private int id_autor;
    private String first_name;

    @Override
    public String toString() {
        return "Autor{" +
                "id_autor=" + id_autor +
                ", first_name='" + first_name + '\'' +
                ", secound_name='" + secound_name + '\'' +
                ", third_name='" + third_name + '\'' +
                '}';
    }

    private String secound_name;
    private String third_name;

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecound_name() {
        return secound_name;
    }

    public void setSecound_name(String secound_name) {
        this.secound_name = secound_name;
    }

    public String getThird_name() {
        return third_name;
    }

    public void setThird_name(String third_name) {
        this.third_name = third_name;
    }

    public Autor(int id_autor, String first_name, String secound_name, String third_name) {
        this.id_autor = id_autor;
        this.first_name = first_name;
        this.secound_name = secound_name;
        this.third_name = third_name;
    }
}
