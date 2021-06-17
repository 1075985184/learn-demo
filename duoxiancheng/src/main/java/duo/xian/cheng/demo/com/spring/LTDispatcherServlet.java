/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/5/27 11:31
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.FrameworkServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LTDispatcherServlet extends LTFeameworkServlet {


    protected void onRefresh(String context) {
        this.initStrategies("11");
    }

    protected void initStrategies(String context) {
        System.out.println("???");
    }
}
