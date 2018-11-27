import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Tools {
//    public static ArrayList<Book> selectBooks(){
//        Connection connection = null;
//        ArrayList<Book> books = null;
//
//        try {
//            connection = getConnection();
//            PreparedStatement SALLFBOOK = connection.prepareStatement("SELECT * FROM librery.book;");
//            ResultSet resultSet = SALLFBOOK.executeQuery();
//            books = new ArrayList<Book>();
//            while(resultSet.next()){
//                int id = resultSet.getInt("id_book");
//                String name_of_book = resultSet.getString("name_of_book");
//                String date_of_create = resultSet.getString("date_of_create");
//                int id_type = resultSet.getInt("id_type");
//                int id_autor = resultSet.getInt("id_autor");
//                books.add(new Book(id,name_of_book,date_of_create,id_autor,id_type));
//            }
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//        }
//        closeConnection(connection);
//
//        return books;
//    }

    public static ArrayList<Student> selectStudents(){
        Connection connection = null;
        ArrayList<Student> students = null;

        try {
            connection = getConnection();
            PreparedStatement SALLFSTUDENT = connection.prepareStatement("SELECT * FROM librery.student;");
            ResultSet resultSet = SALLFSTUDENT.executeQuery();
            students = new ArrayList<Student>();
            while(resultSet.next()){
                int id_student = resultSet.getInt("id_student");
                String first_name = resultSet.getString("first_name");
                String secound_name = resultSet.getString("secound_name");
                String third_name = resultSet.getString("third_name");
                String group = resultSet.getString("group");
                students.add(new Student(id_student,first_name,secound_name,third_name,group));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        closeConnection(connection);

        return students;

    }

    public static ArrayList<Type> selectTypes(){
        Connection connection = null;
        ArrayList<Type> types = null;

        try {
            connection = getConnection();
            PreparedStatement SALLFTYPES = connection.prepareStatement("SELECT * FROM librery.type_of_book;");
            ResultSet resultSet = SALLFTYPES.executeQuery();
            types = new ArrayList<Type>();
            while(resultSet.next()){
                int id_type = resultSet.getInt("id_type");
                String type_of_the_book = resultSet.getString("type_of_book");
                types.add(new Type(id_type,type_of_the_book));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        closeConnection(connection);

        return types;

    }

//    public  static ArrayList<Autor> selectAutor(){
//        Connection connection = null;
//        ArrayList<Autor> autors = null;
//
//        try {
//            connection = getConnection();
//            PreparedStatement SALLFAUTOR = connection.prepareStatement("SELECT * FROM librery.autor;");
//            ResultSet resultSet = SALLFAUTOR.executeQuery();
//            autors = new ArrayList<Autor>();
//            while(resultSet.next()){
//                int id_autor = resultSet.getInt("id_autor");
//                String first_name = resultSet.getString("first_name");
//                String secound_name = resultSet.getString("secound_name");
//                String third_name = resultSet.getString("third_name");
//                autors.add(new Autor(id_autor,first_name,secound_name,third_name));
//            }
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//        }
//        closeConnection(connection);
//
//        return autors;
//    }

    public  static ArrayList<Book_on_hadn> selectBookOnHands(){
        Connection connection = null;
        ArrayList<Book_on_hadn> booksOnHAnds= null;

        try {
            connection = getConnection();
            PreparedStatement SALLFAUTOR = connection.prepareStatement("SELECT * FROM librery.book_on_the_hands;");
            ResultSet resultSet = SALLFAUTOR.executeQuery();
            booksOnHAnds = new ArrayList<Book_on_hadn>();
            while(resultSet.next()){
                int id_student = resultSet.getInt("id_student");
                int id_book = resultSet.getInt("id_book");
                int id_book_instance = resultSet.getInt("id_book_instance");
                booksOnHAnds.add(new Book_on_hadn(id_student,id_book,id_book_instance));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        closeConnection(connection);

        return booksOnHAnds;
    }

    public  static ArrayList<Accounting> selectAccounting(){
        Connection connection = null;
       ArrayList<Accounting> accountings = null;
        try {
            connection = getConnection();
            PreparedStatement SALLFAUTOR = connection.prepareStatement("SELECT * FROM librery.accounting;");
            ResultSet resultSet = SALLFAUTOR.executeQuery();
            accountings = new ArrayList<Accounting>();
            while(resultSet.next()){
                int id_book = resultSet.getInt("id_book");
                int real_count = resultSet.getInt("real_count");
                int toatl_count = resultSet.getInt("total_count");
                accountings.add(new Accounting(id_book,real_count,toatl_count));
            }
       }
        catch (SQLException e){
            e.printStackTrace();
        }
        closeConnection(connection);

        return accountings;
   }

    public static Connection getConnection(){
        String DriverName= "com.mysql.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/librery";
        String login = "root";
        String pass="82180562";
        Connection connection = null;

        try {
            Class.forName(DriverName);
            connection = DriverManager.getConnection(URL,login,pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Autor> parseAutorData(ArrayList<TableEntity> tableEntities){
        ArrayList<Autor> Autors = new ArrayList<Autor>();
        Iterator<TableEntity> tableEntityIterator = tableEntities.iterator();

        while (tableEntityIterator.hasNext()) {
            TableEntity tableEntity = tableEntityIterator.next();
            Autor autor = new Autor(null,tableEntity.getAutor());
            Autors.add(autor);
        }
        return Autors;
    }

    public static ArrayList<Book> parseBookData(ArrayList<TableEntity> tableEntities){
        ArrayList<Book> Books = new ArrayList<Book>();
        Iterator<TableEntity> tableEntityIterator = tableEntities.iterator();

        while (tableEntityIterator.hasNext()) {
            TableEntity tableEntity = tableEntityIterator.next();
            Book book = new Book(tableEntity.getDate_of_create(),tableEntity.getName_of_book());
            Books.add(book);
        }
        return Books;
    }
}
