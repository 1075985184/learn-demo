/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/5/27 11:35
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.spring;

public class Test {
    public static void main(String[] args) throws Exception{
//        LTHttpServletBean ltHttpServletBean = new LTHttpServletBean();
        LTHttpServletBean ltDispatcherServlet = new LTDispatcherServlet();
        ltDispatcherServlet.init();
        System.out.println(ltDispatcherServlet);
    }
}
