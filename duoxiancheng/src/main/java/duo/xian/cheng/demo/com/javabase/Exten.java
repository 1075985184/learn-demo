/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/30 16:03
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.javabase;

public class Exten {
        static int num = 4;                    // 静态变量第二个
        {
            num += 3;
            System.out.println("b");
        }
        int a = 5;{                             // 成员变量第三个
        System.out.println("c");
    }
        Exten()
        {                                         // 类的构造函数，第四个加载
            System.out.println("d");
        }
        static
        {                                        // 静态块，第一个加载
            System.out.println("a");
        }
        static void run()                     // 静态方法，调用的时候才加载// 注意看，e没有加载
        {
            System.out.println("e");
        }
        void putong(){
            System.out.println("f");
        }
        public static void main(String[] args)
        {
            Exten exten = new Exten();

        }

}
