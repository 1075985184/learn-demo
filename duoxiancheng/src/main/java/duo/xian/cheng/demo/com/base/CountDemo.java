/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/10 10:03
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

public class CountDemo {
    public static void main(String[] args)throws Exception {

            new MycountThread("a").start();
            new MycountThread("b").start();
            new MycountThread("c").start();
            new MycountThread("d").start();
            new MycountThread("f").start();
            new MycountThread("g").start();
            new MycountThread("h").start();
            new MycountThread("j").start();
            new MycountThread("k").start();
            new MycountThread("l").start();
            Thread.sleep(2000);
            System.out.println(MycountThread.map.size());
    }
}
