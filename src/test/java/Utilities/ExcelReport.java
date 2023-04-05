package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelReport {

    public static void writeExcel(String path , Scenario scenario , String browserName){
        File file = new File(path);

        if(file.exists()){
            Sheet sheet = null;
            Workbook workbook = null;
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheetAt(0);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
            row.createCell(0).setCellValue(scenario.getName());
            row.createCell(1).setCellValue(scenario.getStatus().toString());
            row.createCell(2).setCellValue(browserName);

            try {
                inputStream.close();
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else {
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
            XSSFSheet xssfSheet = xssfWorkbook.createSheet("group10Sprint1");
            Row row = xssfSheet.createRow(0);
            row.createCell(0).setCellValue(scenario.getName());
            row.createCell(1).setCellValue(scenario.getStatus().toString());
            row.createCell(2).setCellValue(browserName);

            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                xssfWorkbook.write(outputStream);
                xssfWorkbook.close();
                outputStream.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
