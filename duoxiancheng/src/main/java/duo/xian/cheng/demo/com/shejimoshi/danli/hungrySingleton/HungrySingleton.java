/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/30 15:46
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.danli.hungrySingleton;

public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON =new HungrySingleton();{
        System.out.println("成员变量");
    }

    private HungrySingleton() {
        System.out.println("构造方法");
    }

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }



}
