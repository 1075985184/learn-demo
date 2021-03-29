/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/29 14:20
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.abstractfactory;

import duo.xian.cheng.demo.com.shejimoshi.Baoma;
import duo.xian.cheng.demo.com.shejimoshi.Car;
import duo.xian.cheng.demo.com.shejimoshi.FactorMethor.FactoryCreate;

public class BaomaFactor implements CarFactory {

    @Override
    public void createFadongji() {
        System.out.println("宝马发动机--------");
    }

    @Override
    public void createLuntai() {
        System.out.println("宝马轮胎--------");
    }
}
