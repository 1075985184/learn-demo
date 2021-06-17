/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/5/24 11:10
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

public class Test8 {

    public static void main(String[] args) throws Exception{
        int j=0;
        for (int i = 0; i < 100; i++) {
//            System.out.println("11111");
            Thread.sleep(1000);
             j++;
        }
        System.out.println(j);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1111");
            }
        }).start();


    }

}
