/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/5/27 11:28
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.spring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public abstract class LTHttpServletBean extends HttpServlet {

    public final void init() throws ServletException {

        this.initServletBean();

    }

    protected  void initServletBean(){
        System.out.println("httpservletbean");
    };


}
