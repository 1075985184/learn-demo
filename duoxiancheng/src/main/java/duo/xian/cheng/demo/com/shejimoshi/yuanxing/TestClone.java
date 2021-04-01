/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/31 16:26
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.yuanxing;

import java.io.*;

public class TestClone {

    public static void main(String[] args) {

        DeapClone deepCopyObject = new DeapClone("小妞", 18, new DeapClone("二妞", 16));

        DeapClone deepCopyObject2 = (DeapClone) deepCopyObject.deepCopy();

        System.out.println("源对象：" + deepCopyObject);
        System.out.println("深拷贝对象：" + deepCopyObject2);

        System.out.println("源对象hashCode：" +deepCopyObject.hashCode() );
        System.out.println("深拷贝对象hashCode：" +deepCopyObject2.hashCode() );

    }




}
