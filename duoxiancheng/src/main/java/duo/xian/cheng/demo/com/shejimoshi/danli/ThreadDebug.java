/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/31 15:30
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.danli;

import duo.xian.cheng.demo.com.shejimoshi.danli.lazySingleton.LazySingleton;

public class ThreadDebug extends Thread{

    public void run(){
        System.out.println(this.getName());
    }
}
