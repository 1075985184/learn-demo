/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/29 14:20
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.FactorMethor;

import duo.xian.cheng.demo.com.shejimoshi.Baoma;
import duo.xian.cheng.demo.com.shejimoshi.Car;

public class BaomaFactor implements FactoryCreate{

    @Override
    public Car create() {
        return new Baoma();
    }
}
