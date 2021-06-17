/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/5/17 16:10
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test7 {

    public static void main(String[] args) {

////        OutputStream
//        Workbook xxsWorkBook = new XSSFWorkbook();
//
//        InputStream inputStream=new InputStream() {
//            @Override
//            public int read() throws IOException {
//                return 0;
//            }
//        };
        String appkey="00605001Z8";
        String appKeyOrgCode = appkey.substring(0, 5);

        if (appKeyOrgCode.equals("00605")){
//            Integer i= applicationInfoMapper.findByAppKey(appKey);
//            if (i==null){
//                return  CommonResp.buildCommonFailedResp("输入的Appkey不正确");
//            }
        }else {
            System.out.println("222");
//            return  CommonResp.buildCommonFailedResp("提供方appKey超出您的权限范围！");
        }
    }
}
