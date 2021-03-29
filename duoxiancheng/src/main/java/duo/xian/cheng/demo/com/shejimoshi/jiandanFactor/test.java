/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/29 11:28
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.jiandanFactor;

import duo.xian.cheng.demo.com.shejimoshi.Car;

public class test {

    public static void main(String[] args) {

        Factor factor = new Factor();
        Car baoma = factor.create("宝马");
        baoma.run();
        Car benci = factor.create("奔驰");
        benci.run();
    }
}
