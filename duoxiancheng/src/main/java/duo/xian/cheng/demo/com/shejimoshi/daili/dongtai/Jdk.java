/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/2 9:37
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.daili.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Jdk implements InvocationHandler {


    private Object singger;

    public void setSingger(Singger singger){
        this.singger=singger;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Jdk 代理 start--------");
        Object invoke = method.invoke(singger, args);
        System.out.println("Jdk 代理  end--------");
        return invoke;
    }
}
