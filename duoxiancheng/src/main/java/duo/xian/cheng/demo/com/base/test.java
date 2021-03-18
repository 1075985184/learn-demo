/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/10 15:40
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

        String fileName="wca.txt";

        int end = fileName.lastIndexOf(".");
        String endName = fileName.substring(end);

        int start = fileName.lastIndexOf(".");
        fileName = fileName.substring(0,start)+simpleDateFormat.format(new Date())+endName;

        System.out.println(fileName);

//      String s="wc";
//
//      s=s+new Date()
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//        dstFileName=dstFileName+simpleDateFormat.format(new Date());
    }


    public static String getName(String filName) {
        int pos = filName.lastIndexOf(".");
        String extName = filName.substring(0,pos);
        return extName;
    }




}
