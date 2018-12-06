import java.sql.Connection;
import java.util.ArrayList;



public class MainApp {
    public static void printTableEntity(ArrayList<TableEntity> tableEntities){
        for (TableEntity tableEntity:tableEntities) {
            System.out.println(tableEntities.toString());
        }
    }

    public static void main(String[] args) {
        Connection connection = Tools.getConnection();
        ExelParser parser = new ExelParser();
        ArrayList<TableEntity> tableEntities = parser.Parse("U://Projects//" +
                                    "Librery//Vydannye_materialnye_tsennosti.xls");

//        ArrayList<Book> Books = Tools.parseBookData(tableEntities);
//        Tools.insertIntoDBBooks(Books,connection);
//        Tools.insertIntoDBTypes(connection,tableEntities);
//        Book book = new Book("1Q84","1984","Мураками");
//        Controller.inseartBookInDB(book,connection);
//        Controller.takeBook(9,connection);
//        Controller.returnBook(1,connection);
        Controller.deleteBook(connection,77);

    }
}
