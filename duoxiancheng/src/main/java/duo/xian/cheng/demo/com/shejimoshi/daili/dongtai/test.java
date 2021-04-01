/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/1 14:42
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.daili.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class test {

    public static void main(String[] args) {

        SingStar singStar1 = new SingStar();
        Singger singStar = (Singger) Proxy.newProxyInstance(SingStar.class.getClassLoader(),SingStar.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("登台");
                Object invoke =  method.invoke(singStar1,args);
                System.out.println("下台");
                return invoke;
            }
        });
        singStar.sing("王二麻");
    }


}
