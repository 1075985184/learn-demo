/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/24 15:50
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class testQueue {
    public static void main(String[] args)throws Exception {
        final BlockingQueue<Integer> synchronousQueue = new SynchronousQueue<Integer>();
//    final BlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>();
    final BlockingQueue<Integer> linkedBlockingQuene = new SynchronousQueue<Integer>();
    final BlockingQueue<Integer> priorityBlockingQueue = new SynchronousQueue<Integer>();
        new Thread(()->{
            try {
                synchronousQueue.put(211);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Integer   take = synchronousQueue.take();

        System.out.println(take);

    }
}
