/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/29 11:28
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.FactorMethor;

import duo.xian.cheng.demo.com.shejimoshi.Car;
import duo.xian.cheng.demo.com.shejimoshi.jiandanFactor.Factor;

public class test {
    public static void main(String[] args) {

        FactoryCreate benchiFactory = new BenchiFactor();
        FactoryCreate baomaFactory = new BaomaFactor();
        Car benchi = benchiFactory.create();
        benchi.run();
        Car baoma = baomaFactory.create();
        baoma.run();
    }
}
