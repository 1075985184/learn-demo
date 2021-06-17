/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/6/4 17:08
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.Jgit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jgit")
public class JgitController {

    @Autowired
    private JgitSerivce jgitSerivce;

    @GetMapping("/test")
    public Object test (){
        Object o = null;
        try {
            o = jgitSerivce.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }


}
