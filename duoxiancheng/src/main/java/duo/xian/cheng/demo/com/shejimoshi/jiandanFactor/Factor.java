/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/29 11:30
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.jiandanFactor;

import duo.xian.cheng.demo.com.shejimoshi.Baoma;
import duo.xian.cheng.demo.com.shejimoshi.Benchi;
import duo.xian.cheng.demo.com.shejimoshi.Car;

public class Factor {

    public Car create(String name){
        Car car=null;
        if ("奔驰".equals(name)){
           car =new Benchi();
            return car;
        }else if ("宝马".equals(name)){
            car=new Baoma();
            return car;
        }
        return car;
    }

}
