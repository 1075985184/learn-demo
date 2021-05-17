/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/13 10:03
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test5 {

    public static void main(String[] args) {
        test5 test5 = new test5();
        List<OspLuckyNumberSalesDO> ospLuckyNumberSalesDOS1 = new ArrayList<>();
        OspLuckyNumberSalesDO ospLuckyNumberSalesDO = new OspLuckyNumberSalesDO();
        ospLuckyNumberSalesDO.setReturnMsg("success");
        for (int i = 0; i <20 ; i++) {
            ospLuckyNumberSalesDOS1.add(ospLuckyNumberSalesDO);
        }
        Long id=new Long(5);
        test5.writeReturn("测试返回文件名称.xls",ospLuckyNumberSalesDOS1,"吉祥号上传文件.xls","C:\\Users\\Administrator\\Desktop\\测试文件夹\\","C:\\Users\\Administrator\\Desktop\\测试文件夹\\测试\\",id );

    }

    public void writeReturn(String returnFile, List<OspLuckyNumberSalesDO> ospLuckyNumberSalesDOS1, String fileName, String uploadFile, String inputFile, Long id) {

        try {
            String ext = fileName.substring(fileName.lastIndexOf("."));
            Workbook wb;
            InputStream is = new FileInputStream(uploadFile+fileName);
            if (".xls".equals(ext)) {
                wb = new HSSFWorkbook(is);
            } else if (".xlsx".equals(ext)) {
                wb = new XSSFWorkbook(is);
            } else {
                wb = null;
            }
            if (wb == null) {
            }

            Sheet sheet = wb.getSheetAt(0);
            int rowNum = sheet.getLastRowNum();

            for (int i = 1; i <=rowNum; i++) {
                Cell cell = sheet.getRow(i).createCell(10);
                String returnMsg = ospLuckyNumberSalesDOS1.get(i - 1).getReturnMsg();
                cell.setCellValue(returnMsg);
            }
            OutputStream os = new FileOutputStream(inputFile+id+"_"+returnFile);
            wb.write(os);
            is.close();
            os.flush();
            os.close();
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("生成反馈文件失败！");
        }

    }
}
