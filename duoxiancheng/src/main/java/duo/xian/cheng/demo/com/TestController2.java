/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/29 14:44
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com;

import duo.xian.cheng.demo.com.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
@RequestMapping("/test")
public class TestController2 {

    @Autowired
    private StringRedisTemplate template;

    @Autowired
    private RedisService redisService;

    @RequestMapping("/header")
    private String testRequestHeader(@RequestHeader("Accept-Encoding") String encoding){
        System.out.println(encoding);
//        System.out.println(test);
        return encoding;
    }
    @RequestMapping("/testRedis")
    private String testRedis(){
        Properties info = template.getConnectionFactory().getConnection().info();
        return info.getProperty("run_id");
//        System.out.println(test);

    }
//    @RequestMapping("/kafka")
//    private String testKafka(){
//
//    }
@RequestMapping("/testRedis2")
private String testRediswithRedisson(){
    redisService.testString();
    return "success";
//        System.out.println(test);
}
}
