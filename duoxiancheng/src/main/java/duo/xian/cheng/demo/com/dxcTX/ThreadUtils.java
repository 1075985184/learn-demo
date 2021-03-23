package duo.xian.cheng.demo.com.dxcTX;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;


public class ThreadUtils {
    private static ThreadFactory nameThreadFactory = new ThreadFactoryBuilder().setNameFormat("test").build();
    private static ExecutorService service = new ThreadPoolExecutor(16, 40, 0L
            , TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(1024), nameThreadFactory, new ThreadPoolExecutor.AbortPolicy());

    public static ExecutorService getService(){
        return service;
    }

    public static void newTask(Runnable r){
        service.execute(r);
    }
}
