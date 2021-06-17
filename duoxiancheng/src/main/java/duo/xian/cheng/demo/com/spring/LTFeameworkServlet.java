/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/5/27 11:29
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.ServletException;

public abstract class LTFeameworkServlet extends LTHttpServletBean {

    protected final void initServletBean()  {

         this.initWebApplicationContext();

    }

    protected  void initWebApplicationContext(){

        this.onRefresh("");

    }

    protected void onRefresh(String context) {

    }
}
