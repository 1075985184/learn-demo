/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/1 14:39
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.daili.jingtai;

public class Jingjiren implements Singger{

    private SingStar singStar;

    public void setSingStar(SingStar singStar) {
        this.singStar = singStar;
    }

    @Override
    public void sing(String name) {
        System.out.println("谈钱------");
        singStar.sing(name);
        System.out.println("收钱------");

    }
}
