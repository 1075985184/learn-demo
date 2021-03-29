/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/29 11:28
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.abstractfactory;



public class test {
    public static void main(String[] args) {

        CarFactory baomaFactor = new BaomaFactor();
        baomaFactor.createFadongji();
        baomaFactor.createLuntai();
        CarFactory baoshijieFactor = new BaoshijieFactor();
        baoshijieFactor.createFadongji();
        baoshijieFactor.createLuntai();

    }
}
