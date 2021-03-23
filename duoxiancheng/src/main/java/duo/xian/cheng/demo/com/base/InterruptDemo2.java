/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/22 14:08
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import java.util.concurrent.TimeUnit;

public class InterruptDemo2 {

    private static int i;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Num:" + i);
        }, "interruptDemo");
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
        System.out.println(thread.isInterrupted());
    }
}
