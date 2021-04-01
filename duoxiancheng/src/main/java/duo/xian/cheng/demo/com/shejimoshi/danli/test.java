/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/30 16:09
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.danli;


import duo.xian.cheng.demo.com.shejimoshi.danli.enumtest.EnumSinfleton;
import duo.xian.cheng.demo.com.shejimoshi.danli.lazySingleton.LazyInnerClass;
import duo.xian.cheng.demo.com.shejimoshi.danli.lazySingleton.LazySingleton;

public class test {

    public static void main(String[] args) {

//            ThreadDebug threadDebug1 = new ThreadDebug();
//            ThreadDebug threadDebug2 = new ThreadDebug();
//            ThreadDebug threadDebug3 = new ThreadDebug();
//            ThreadDebug threadDebug4 = new ThreadDebug();
//
//        threadDebug1.setName("Thread--------1");
//        threadDebug2.setName("Thread--------2");
//        threadDebug3.setName("Thread--------3");
//        threadDebug4.setName("Thread--------4");
//
//        threadDebug1.start();
//          threadDebug2.start();
//          threadDebug3.start();
//          threadDebug4.start();



//        LazyInnerClass lazyInnerClass = new LazyInnerClass();
//        LazyInnerClass.lazy.test();

        System.out.println( EnumSinfleton.getInstance());
    }



}
