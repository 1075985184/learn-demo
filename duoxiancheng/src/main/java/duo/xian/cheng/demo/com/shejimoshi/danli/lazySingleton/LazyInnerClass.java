/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/31 15:52
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.danli.lazySingleton;

public class LazyInnerClass {

    public LazyInnerClass(){

    };

    public static final LazyInnerClass getInstance(){
        //在返回结果以前，一定会先加载内部类
        return lazy.lazyInnerClass;
    }

    public static class lazy{
        {
            System.out.println(111);
        }
        private static final LazyInnerClass lazyInnerClass=  new LazyInnerClass();
        public static void test(){
            System.out.println("test");
        }
    }

}
