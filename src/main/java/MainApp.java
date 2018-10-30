import java.sql.*;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
       // ArrayList<Book> books = Tools.selectBooks();
//        ArrayList<Student> students = Tools.selectStudents();
//        for (Student s: students) {
//            System.out.println(s.toString());
//        }
//       for (Book b : books) {
//            System.out.println(b.toString());  }

        ExelParser parser = new ExelParser();
        ArrayList<TableEntity> tableEntities = parser.Parse("U://Projects//Librery//Vydannye_materialnye_tsennosti.xls");
        for (TableEntity t: tableEntities) {
            System.out.println(t.toString());
        }

    }



}
