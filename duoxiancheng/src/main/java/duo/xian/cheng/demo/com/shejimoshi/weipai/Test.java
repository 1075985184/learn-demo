/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/22 14:56
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.weipai;

public class Test {
    public static void main(String[] args) {
        new Boss().command("A",new Leader());
        new Boss().command("B",new Leader());
    }
}
