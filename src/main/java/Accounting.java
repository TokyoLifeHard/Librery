public class Accounting {
    int id_book;
    int real_count;
    int total_count;
    public Accounting(int id_book, int real_count, int total_count) {
        this.id_book = id_book;
        this.real_count = real_count;
        this.total_count = total_count;
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public int getReal_count() {
        return real_count;
    }

    public void setReal_count(int real_count) {
        this.real_count = real_count;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "id_book=" + id_book +
                ", real_count=" + real_count +
                ", total_count=" + total_count +
                '}';
    }
}
