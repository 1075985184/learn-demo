/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/23 10:12
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.dxcTX;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.*;


public class CustomizableThreadFactoryUtils {
    ThreadFactory springThreadFactory = new CustomizableThreadFactory("springThread-pool-");


    ExecutorService exec = new ThreadPoolExecutor(1, 1,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(10),springThreadFactory);

//       exec.submit(() -> {
//        logger.info("--记忆中的颜色是什么颜色---");
//    });

}
