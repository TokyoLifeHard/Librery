import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ExelParser parser = new ExelParser();
        ArrayList<TableEntity> tableEntities = parser.Parse("U://Projects//Librery//Vydannye_materialnye_tsennosti.xls");
    }
}
