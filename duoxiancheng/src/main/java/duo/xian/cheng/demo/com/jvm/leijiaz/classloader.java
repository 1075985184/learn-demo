/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/8/27 17:35
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.jvm.leijiaz;

public class classloader {

    static {
        System.out.println("*************load TestDynamicLoad************");
    }

    public static void main(String[] args) {
        new A();
        System.out.println("*************load test************");
        B b = null; //B不会加载，除非这里执行 new B()
    }
}


class A {

    static {
        System.out.println("*************load A************");

    }

    public A() {
        System.out.println("*************initial A************");

    }
}

class B {

    static {
        System.out.println("*************load B************");

    }

    public B() {
        System.out.println("*************initial B************");

    }
}


//    public static void main(String[] args) {
//
//
//    }

//}
