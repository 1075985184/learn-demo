/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/6/17 10:04
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import java.io.File;

public class TestAsyn {

    public static void main(String[] args)throws Exception {
        File file = new File("C:\\Users\\Administrator\\Desktop\\diff.txt");
        Runtime.getRuntime().exec("git diff "+" > diff.txt",null,file);
    }
}
