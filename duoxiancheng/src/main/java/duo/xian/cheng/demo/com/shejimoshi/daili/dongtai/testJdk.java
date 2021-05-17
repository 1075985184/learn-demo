/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/2 9:41
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.daili.dongtai;

import java.lang.reflect.Proxy;

public class testJdk {
    public static void main(String[] args) throws Exception {

        Singger singger = new SingStar();

        Jdk jdk = new Jdk();

        jdk.setSingger(singger);

        Singger subject = (Singger) Proxy.newProxyInstance(Singger.class.getClassLoader(),singger.getClass().getInterfaces(), jdk);


        subject.sing("王二麻");



    }
}
