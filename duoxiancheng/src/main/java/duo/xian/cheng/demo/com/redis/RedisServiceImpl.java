/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/6/17 10:47
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.redis;

import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedisServiceImpl implements RedisService{

    @Autowired
    private RedissonClient redissonClient;


    @Override
    public void testString() {
        RMap<String, String> rMap = redissonClient.getMap("bocrm::bizType",new StringCodec());
        rMap.remove("01001");

//        map.put("testuserList",objects);
        System.out.println(rMap);

    }
}
