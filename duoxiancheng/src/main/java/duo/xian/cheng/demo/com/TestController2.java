/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/29 14:44
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController2 {

    @RequestMapping("/header")
    private String testRequestHeader(@RequestHeader("Accept-Encoding") String encoding){
        System.out.println(encoding);
//        System.out.println(test);
        return encoding;
    }

}
