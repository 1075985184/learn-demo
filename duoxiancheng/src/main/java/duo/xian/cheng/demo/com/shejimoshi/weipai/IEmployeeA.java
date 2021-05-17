/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/22 14:50
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.weipai;

public class IEmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.printf("A+doing"+command);
    }
}
