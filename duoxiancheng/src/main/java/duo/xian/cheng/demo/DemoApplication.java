package duo.xian.cheng.demo;

import duo.xian.cheng.demo.com.fenbus.kafka.ProductKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private ProductKafka kafkaSender;
//    @PostConstruct
//    public void init(){
//        for (int i = 0; i < 10; i++) {
//            调用消息发送类中的消息发送方法
//            kafkaSender.send("lantian -----"+String.valueOf(i));
//        }
//    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
