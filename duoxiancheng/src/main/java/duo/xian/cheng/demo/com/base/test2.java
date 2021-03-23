/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/23 17:02
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

public class test2 {
    public static void main(String[] args) {

//
//        MyThread myThread1 = new MyThread();
//        myThread1.setI(1);
//        myThread1.start();
//        MyThread myThread2 = new MyThread();
//        myThread2.setI(2);
//        myThread2.start();
//        MyThread myThread3 = new MyThread();
//        myThread3.setI(3);
//        myThread3.start();
        MyThread myThread4 = new MyThread();
        myThread4.setI(4);
        myThread4.start();
        myThread4.interrupt();

//       Thread thread= new Thread(()->{
//           while (true){
//               if (myThread1.getSuccess()){
//                   myThread1.interrupt();
//               }
//               if (myThread2.getSuccess()){
//                   myThread2.interrupt();
//               }
//               if (myThread3.getSuccess()){
//                   myThread3.interrupt();
//               }
//               if (myThread4.getSuccess()){
//                   myThread4.interrupt();
//               }
//           }
//        });
//       thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
