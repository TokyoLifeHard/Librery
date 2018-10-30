import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ExelParser {
    public static ArrayList<TableEntity> Parse(String path){
        ArrayList<TableEntity> tableEntities = new ArrayList<TableEntity>();
        InputStream inputStream = null;
        HSSFWorkbook workBook = null;
        try {
            inputStream = new FileInputStream(path);
            workBook = new HSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //разбираем первый лист входного файла на объектную модель

        Sheet sheet = workBook.getSheetAt(1);
        Iterator<Row> it = sheet.iterator();
        //проходим по всему листу
        while (it.hasNext()) {
            TableEntity tableEntity = new TableEntity();
            Row row = it.next();
            int lastcell = row.getLastCellNum();
            Iterator<Cell> cellIterator = row.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                int cellType = cell.getCellType();
                //перебираем возможные типы ячеек
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        tableEntity.setAutor(cell.getStringCellValue());
                        tableEntity.setName_of_book(cell.getStringCellValue());
                        tableEntity.setType(cell.getStringCellValue());
                        tableEntity.setDate_of_create(cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        tableEntity.setReal_count_books((int)cell.getNumericCellValue());
                        tableEntity.setBooks_on_the_hands((int)cell.getNumericCellValue());
                        break;

//                    case Cell.CELL_TYPE_FORMULA:
//                        tableEntity.setAll_count_books((int)cell.getCellFormula());
//                        break;
                }
                if(lastcell==row.getLastCellNum()){
                    tableEntity.setAll_count_books(tableEntity.getReal_count_books()+tableEntity.getBooks_on_the_hands());
                }
            }
            tableEntities.add(tableEntity);
        }

        return tableEntities;
    }
    }

