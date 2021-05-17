/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/22 16:55
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.jvm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeapController {
    List<Person> list = new ArrayList<Person>();

    @GetMapping("/heap")
    public String heap() throws Exception {
        System.out.println(1);
        while (true) {
            list.add(new Person());
            Thread.sleep(1);
        }
    }
}
