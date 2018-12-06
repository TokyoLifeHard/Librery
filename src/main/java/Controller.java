import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {

    public static void inseartBookInDB(Book book, Connection connection) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("INSERT INTO librery.book (autor, name_of_book, date_of_create) VALUES (?, ?, ?);");
            stmt.setString(1, book.getAutorName());
            stmt.setString(2, book.getName_of_book());
            stmt.setString(3, book.getDate_of_create());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void takeBook(int idBook, Connection connection) {
        int total_count = 0;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("SELECT accounting.total_count from librery.accounting where id_book=" + Integer.toString(idBook));
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
            total_count = rs.getInt("total_count");}
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement stmt = null;
        if (total_count>0)
        try {
            stmt = connection.prepareStatement("UPDATE librery.accounting set accounting.total_count = accounting.total_count-1 WHERE id_book =" + Integer.toString(idBook));
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void returnBook(int idBook, Connection connection) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE librery.accounting set accounting.total_count = accounting.total_count+1 WHERE id_book =" + Integer.toString(idBook));
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void groupByBooks(Connection connection, String groupByAtribyte) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * from librery.book group by" + groupByAtribyte);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //Исключение если пробуем удать не существующуу книгу
    //Удалие в произвольном месте таблицы буду ти пересчитываться id сос свойством autoicrement
    public static void deleteBook(Connection connection, int idBook) {
        int id;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("SELECT book.id_book from librery.book where id_book=" + Integer.toString(idBook));
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
               id  = rs.getInt("id_book");
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("DELETE * from librery.book where book.id_book=" + Integer.toString(idBook));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


