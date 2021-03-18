/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/9 16:57
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;


public class MycountThread extends Thread{

    private String message;

    public MycountThread( String message) {
        this.message = message;
    }

    public static   int count=10000;
    public static Map<Integer,String> map=new HashMap<>();

    @Override
    public  void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (MycountThread.class) {
            while (count > 0) {
                count--;
                map.put(count, count + "");
                System.out.println(message + "==" + count);
            }
        }
    }
}
