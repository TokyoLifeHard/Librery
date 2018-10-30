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
        Iterator<Row> rowIterator = sheet.iterator();
        //проходим по всему листу
        while (rowIterator.hasNext()) {
            TableEntity tableEntity = new TableEntity();
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();
            while (cellIterator.hasNext()) {
                int cellNum = 0;
                Cell cell = cellIterator.next();
                int cellType = cell.getCellType();
                //перебираем возможные типы ячеек
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        if(cellNum==1){
                            tableEntity.setAutor(cell.getStringCellValue());
                            cellNum++;
                        }
                        if(cellNum==2){
                            tableEntity.setName_of_book(cell.getStringCellValue());
                            cellNum++;
                        }
                        if (cellNum==3 ){
                            tableEntity.setType(cell.getStringCellValue());
                            cellNum++;
                        }
                        if(cellNum==4){
                            tableEntity.setDate_of_create(cell.getStringCellValue());
                            cellNum++;
                        }
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        if(cellNum==0)
                            tableEntity.setNumofrow((int)cell.getNumericCellValue());
                            cellNum++;
                        if(cellNum==5){
                            tableEntity.setReal_count_books((int)cell.getNumericCellValue());
                        }
                        if(cellNum==6){
                            tableEntity.setBooks_on_the_hands((int)cell.getNumericCellValue());
                        }
                        break;

                    case Cell.CELL_TYPE_FORMULA:
                        break;
                }

            }
            tableEntities.add(tableEntity);
        }

        return tableEntities;
    }
    }

