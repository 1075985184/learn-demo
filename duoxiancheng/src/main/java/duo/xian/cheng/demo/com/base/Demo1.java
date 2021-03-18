/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/9 16:25
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            Thread a = new Thread(() -> {
                LoginServlet.doPost("a", "aa");
            });
            a.start();
            Thread b = new Thread(() -> {
                LoginServlet.doPost("b", "bb");
            });
            b.start();
        }
    }

}
