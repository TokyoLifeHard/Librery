import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class ExelParser {
    public static ArrayList<TableEntity> Parse(String path) {
        ArrayList<TableEntity> tableEntities = new ArrayList<TableEntity>();
        InputStream inputStream = null;
        HSSFWorkbook workBook = null;
        ExtendedStack ValuesFromTable = new ExtendedStack();

        try {
            inputStream = new FileInputStream(path);
            workBook = new HSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Sheet sheet = workBook.getSheetAt(1);
        Iterator<Row> rowIterator = sheet.iterator();

        if (rowIterator.hasNext()) {
            rowIterator.next();
        }

        int count_rows = 0;
        while (rowIterator.hasNext()) {

            TableEntity tableEntity = new TableEntity();
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();
            count_rows++;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        String s1 =  cell.getStringCellValue();
                        ValuesFromTable.push(s1);
                        //System.out.println(s1);
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        String s2 = Integer.toString((int) cell.getNumericCellValue());
                        ValuesFromTable.push(s2);
                        //System.out.println(s2);
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        break;
                    default:
                        ValuesFromTable.push(null);
                        //System.out.println("null");
                }
            }

            if (ValuesFromTable.isNotNull()) {
                tableEntity.setNumofrow(ValuesFromTable.pop());
                tableEntity.setAutor(ValuesFromTable.pop());
                tableEntity.setType(ValuesFromTable.pop());
                tableEntity.setDate_of_create(ValuesFromTable.pop());
                tableEntity.setReal_count_books(ValuesFromTable.pop());
                tableEntity.setBooks_on_the_hands(ValuesFromTable.pop());
                tableEntities.add(tableEntity);
            }
            if (!ValuesFromTable.isNotNull()){
                System.out.println("break");
                break;
            }
        }
        return tableEntities;
    }
}

