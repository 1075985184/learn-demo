/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/6/9 17:16
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.fenbus.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class CoumKafKa {


    @KafkaListener(topics ="testTopic", groupId = "gropup 1")
    public void topic_test(ConsumerRecord record) {

        Optional message = Optional.ofNullable(record.value());
        if (message.isPresent()) {
            Object msg = message.get();
            log.info("topic_test 消费了： Topic:" + "topic" + ",Message:" + msg);
//            ack.acknowledge();
        }
    }

    @KafkaListener(topics ="testTopic", groupId = "gropup 2")
    public void topic_test2(ConsumerRecord record) {

        Optional message = Optional.ofNullable(record.value());
        if (message.isPresent()) {
            Object msg = message.get();
            log.info("topic_test2 消费了： Topic:" + "topic" + ",Message:" + msg);
//            ack.acknowledge();
        }
    }

//    @KafkaListener(topics = KafkaProducer.TOPIC_TEST, groupId = KafkaProducer.TOPIC_GROUP2)
//    @KafkaListener(topics ="testTopic", groupId = "gropup 2")
//    public void topic_test1(ConsumerRecord<?, ?> record, Acknowledgment ack, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
//
//        Optional message = Optional.ofNullable(record.value());
//        if (message.isPresent()) {
//            Object msg = message.get();
//            log.info("topic_test1 消费了： Topic:" + topic + ",Message:" + msg);
//            ack.acknowledge();
//        }
//    }
}
