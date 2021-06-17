/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/6/9 17:06
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.fenbus.kafka;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
@Slf4j
public class ProductKafka {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void send(String message) {
        try {
            ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("testTopic", message);
            future.addCallback(o -> log.info("The NewBizApiMesage is sent to MQ. topic:{}, message:{}", "topicName", message),
                    throwable -> sentFailAction("topicName", message, throwable));
        } catch (Exception e) {
            log.error("MQ-Excepted. Send NewBizApiMesage is excepted. topic:{}, message:{}", "topicName", message, e);
        }
        }

    private void sentFailAction(String topicName, String message, Throwable throwable) {
        log.error("MQ-Excepted. Send NewBizApiMesage is excepted(callback). topic:{}, message:{}", topicName, message, throwable);
    }

}