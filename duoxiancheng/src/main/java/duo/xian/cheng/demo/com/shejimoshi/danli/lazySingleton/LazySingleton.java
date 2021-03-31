/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/30 16:18
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.danli.lazySingleton;

public class LazySingleton {

    private static LazySingleton lazySingleton=null;

    private LazySingleton(){}


    public static LazySingleton getInstance(){
        if (lazySingleton==null){
//            synchronized (LazySingleton.class) {
//                if (lazySingleton==null){
                    lazySingleton= new LazySingleton();
//            }
//            }
            }
        return lazySingleton;
    }


}
