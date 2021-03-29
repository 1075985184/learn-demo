/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/24 16:15
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.redis;
//import org.redisson.Redisson;
//import org.redisson.api.RAtomicLong;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//import org.redisson.config.SingleServerConfig;

public class demo1 {



        public static void main(String[] args) {
//            Config config = new Config();
//
//            SingleServerConfig singleServerConfig = config.useSingleServer();
//            singleServerConfig.setAddress("redis://127.0.0.1:6379");
//
//            RedissonClient redissonClient = Redisson.create(config);
//
//            RAtomicLong atomicVar = redissonClient.getAtomicLong("test");
//            long value = atomicVar.incrementAndGet(); // 多线程调用该方法，不会造成数据丢失
//            System.out.println(value);

        }


//     RLock lock = redisson.getLock("anyLock");
// // 最常见的使用方法
//         lock.lock();
// // 支持过期解锁功能 10秒钟以后自动解锁
//         // 无需调用unlock方法手动解锁
//         lock.lock(10, TimeUnit.SECONDS);
 // 尝试加锁，最多等待100秒，上锁以后10秒自动解锁 boolean res = lock.tryLock(100, 10, TimeUnit.SECONDS); lock.unlock();

}
