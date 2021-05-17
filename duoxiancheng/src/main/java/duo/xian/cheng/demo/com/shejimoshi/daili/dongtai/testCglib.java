/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/2 10:28
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.daili.dongtai;

import net.sf.cglib.proxy.Enhancer;

import java.util.HashMap;

public class testCglib {
    public static void main(String[] args) throws Exception {

        //确定代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor的方法
        SingCglibStar instance = (SingCglibStar) new Cglib().getInstance(SingCglibStar.class);

        instance.sing("test");

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

    }
}
