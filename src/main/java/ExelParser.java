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
        short numOfStr = 0;

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

        ExtendedStack stack;
        while (rowIterator.hasNext()) {

            TableEntity tableEntity = new TableEntity();
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();
            stack = new ExtendedStack();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        String s1 =  cell.getStringCellValue();
                        stack.push(s1);
                        System.out.println(s1);
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        String s2 = Integer.toString((int) cell.getNumericCellValue());
                        stack.push(s2);
                        System.out.println(s2);
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        break;
                    default:
                        stack.push(null);
                        System.out.println("null");
                }
            }
            System.out.println("-------------------");
            numOfStr++;
            System.out.println("НОМЕР СТРОКИ"+numOfStr);
            if (stack.isNotNull()) {
                tableEntity.setNumofrow(stack.pop());
                tableEntity.setAutor(stack.pop());
                tableEntity.setName_of_book(stack.pop());
                tableEntity.setType(stack.pop());
                tableEntity.setDate_of_create(stack.pop());
                tableEntity.setReal_count_books(stack.pop());
                tableEntity.setBooks_on_the_hands(stack.pop());
                tableEntities.add(tableEntity);
                System.out.println("КОЛЛИЧЕСТВО ЭЛЕМЕНТОВ СТРОКИ "+ stack.getSize());
            }

            stack = null;
        }
        return tableEntities;
    }
}

