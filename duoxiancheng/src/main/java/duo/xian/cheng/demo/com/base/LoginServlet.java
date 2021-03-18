/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/9 16:37
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

public class LoginServlet {
    private static String username;
    private static String password;

    public static void doPost(String userna,String pass){
        try {
         username=userna;
         password=pass;
            if ("a".equals(userna)){
                Thread.sleep(1000);
            }
            System.out.println("username="+username+"  password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
