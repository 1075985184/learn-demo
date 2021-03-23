/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/9 16:57
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import java.util.HashMap;
import java.util.Map;


public class MyThread extends Thread{

    private static boolean success =false;

    private  int i;

    public void setI(int i){
        this.i=i;
    }
    public boolean getSuccess(){
        return this.success;
    }

    @Override
    public  void run() {
            try {
                while (true){
                System.out.println("thread "+i+"-----1---------");
                if (i==1){
                    int z=1/0;
                }
            }} catch (Exception e) {
                success=true;
                System.out.println("===========================================================================================================================================================");
                e.printStackTrace();
            }
        }


}
