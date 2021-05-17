/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/2 9:37
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.daili.dongtai;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Cglib implements MethodInterceptor {

//    private Object singger;
//
//    public void setSingger(Singger singger){
//        this.singger=singger;
//    }
public Object getInstance(Class<?> clazz) throws Exception{
    //相当于Proxy，代理的工具类
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(clazz);
    enhancer.setCallback(this);
    return enhancer.create();
}

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理start----------");
        Object r = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib动态代理end----------");
        return r;
    }
}
