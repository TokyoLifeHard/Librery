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
        Stack<String> ValuesFromTable = new Stack<String>();

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


        while (rowIterator.hasNext()) {

            TableEntity tableEntity = new TableEntity();
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();

            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        ValuesFromTable.push(cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        ValuesFromTable.push(Integer.toString((int) cell.getNumericCellValue()));
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        break;
                    default:
                        ValuesFromTable.push(null);
                }
            }

            System.out.println(ValuesFromTable.pop());
            System.out.println(ValuesFromTable.pop());
            System.out.println(ValuesFromTable.pop());
            System.out.println(ValuesFromTable.pop());
            System.out.println(ValuesFromTable.pop());
            System.out.println(ValuesFromTable.pop());
            System.out.println(ValuesFromTable.pop());
            System.out.println("---------------------------------------------------------------");
        }
        return tableEntities;
    }
}

