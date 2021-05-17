/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/22 14:52
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.weipai;

import java.util.HashMap;

public class Leader {

    private HashMap<String,IEmployee> targe=new HashMap<>();

    public Leader() {

        targe.put("A",new IEmployeeA());
        targe.put("B",new IEmployeeA());
    }

    public void doing(String command){
       targe.get(command).doing(command);
    }


}
