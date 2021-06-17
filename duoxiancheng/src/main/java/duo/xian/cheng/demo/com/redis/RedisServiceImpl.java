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
        RMap<Object, Object> map = redissonClient.getMap("testkeymap");

        map.put("teststring","123");

        map.put("testuser",new User("李四","25"));

        List<User> objects = new ArrayList<>();
        objects.add(new User("王五","21"));
        objects.add(new User("周六","18"));
        map.put("testuserList",objects);


    }
}
