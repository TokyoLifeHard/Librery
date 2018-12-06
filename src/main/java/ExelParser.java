import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


import javax.xml.bind.SchemaOutputResolver;
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
        short numOfStr = 1;

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
                        String s1 = cell.getStringCellValue();
                        stack.push(s1);

                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        String s2 = Integer.toString((int) cell.getNumericCellValue());
                        stack.push(s2);

                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        break;
                    default:
                        stack.push(null);

                }
            }

            if (stack.isNotNull()) {
                stack.pop();
                stack.pop();
                tableEntity.setBooks_on_the_hands(stack.pop());
                tableEntity.setReal_count_books(stack.pop());
                tableEntity.setDate_of_create(stack.pop());
                tableEntity.setType(stack.pop());
                tableEntity.setName_of_book(stack.pop());
                tableEntity.setAutor(stack.pop());
                tableEntity.setNumofrow(stack.pop());
                tableEntities.add(tableEntity);

            } else {
                break;
            }
//            System.out.println("НОМЕР СТРОКИ "+tableEntity.getNumofrow());
//            System.out.println("АВТОР "+tableEntity.getAutor());
//            System.out.println("НАЗВАНИЕ КНИГИ "+tableEntity.getName_of_book());
//            System.out.println("ТИП КНИГИ "+tableEntity.getType());
//            System.out.println("ДАТА СОЗДАНИЯ "+tableEntity.getDate_of_create());
//            System.out.println("ОСТАТОК "+tableEntity.getReal_count_books());
//            System.out.println("НА РУКАХ "+tableEntity.getBooks_on_the_hands());
//            System.out.println("---------------------------------");
            stack = null;
        }
        return tableEntities;
    }

}

