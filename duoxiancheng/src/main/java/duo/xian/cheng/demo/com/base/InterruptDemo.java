/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/22 14:01
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import java.util.concurrent.TimeUnit;

public class InterruptDemo {
        private static int i;
        public static void main(String[] args) throws InterruptedException {
            Thread thread=new Thread(()->{
                while(!Thread.currentThread().isInterrupted()){ //默认情况下isInterrupted 返回 false、通过 thread.interrupt 变成了 true
                    i++;
                }
                System.out.println("Num:"+i);
            },"interruptDemo");
            thread.start();
            TimeUnit.SECONDS.sleep(1);
            thread.interrupt(); //加和不加的效果
        } }

//public class InterruptDemo {
//    private static int i;
//    public static void
//    main(String[] args) throws
//            InterruptedException {
//        Thread thread=new
//                Thread(()->{
//            while(true){
//
//                if(Thread.currentThread().isInterrupted()){
//
//                    System.out.println("before:"+Thread.currentThread().isInterrupted())
//                    ;
//
//                    Thread.interrupted(); //对线程进行复位，由 true 变成 false
//
//                    System.out.println("after:"+Thread
//                            .currentThread().isInterrupted());
//                }
//            }
//        },"interruptDemo");
//        thread.start();
//        TimeUnit.SECONDS.sleep(1);
//        thread.interrupt();
//    } }