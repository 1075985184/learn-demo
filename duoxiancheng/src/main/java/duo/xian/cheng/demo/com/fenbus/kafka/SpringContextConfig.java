//package duo.xian.cheng.demo.com.fenbus.kafka;
//
//import com.boc.resourcemanager.common.contants.KafkaConfigGroup;
//import com.boc.resourcemanager.component.httpclient.HttpClientConfig;
//import com.boc.resourcemanager.config.BocKafkaProperties;
//import com.boc.resourcemanager.config.CommonConfigItem;
//import com.boc.resourcemanager.config.SysConfig;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.client.ClientHttpResponse;
//import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.web.client.ResponseErrorHandler;
//import org.springframework.web.client.RestTemplate;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * 基础Spring配置
// *
// * @author Hong-Yang Xiao
// */
//@Configuration
//public class SpringContextConfig {
////    private final SysConfig sysConfig;
//
//    @Value("kafka.bootstrap-servers")
//    private String kafkahost;
//
//    private final KafkaProperties springBootDefaultProperties;
//
//
//
//    /**
//     * 加载配置RestTemplate的BEAN方法
//     * @return RestTemplate类的bean
//     */
//    @Bean
//    public RestTemplate restTemplate() {
//
//
//        OkHttp3ClientHttpRequestFactory requestFactory = new OkHttp3ClientHttpRequestFactory();
//        requestFactory.setReadTimeout(300000);
//        requestFactory.setConnectTimeout(300000);
//
//        RestTemplate restTemplate = new RestTemplate(requestFactory);
//        restTemplate.setErrorHandler(new ResponseErrorHandler() {
//            @Override
//            public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
//                return false;
//            }
//
//            @Override
//            public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
//                throw new UnsupportedOperationException();
//            }
//        });
//
//        return restTemplate;
//    }
//
//    @Bean
//    public KafkaTemplate<String, String> kafkaTemplateForNewBizApi() {
//        return new KafkaTemplate<>(newBizApiProducerFactory(), true);
//    }
//
//    @Bean
//    public ProducerFactory<String, String> newBizApiProducerFactory() {
//        Map<String, Object> properties = buildProducerProperties(KafkaConfigGroup.NEW_BIZ_API);
//        return new DefaultKafkaProducerFactory<>(properties);
//    }
//
//    private Map<String, Object> buildProducerProperties(String itemName) {
//        Map<String, Object> properties = buildSpringBootDefaultProducerProperties();
//
//        BocKafkaProperties kafkaProperties = sysConfig.getKafka();
//        if (kafkaProperties != null) {
//            properties.putAll(kafkaProperties.buildProducerProperties());
//            putAdvanceConfig(properties, kafkaProperties.getAdvance());
//            BocKafkaProperties itemKafkaProperties = kafkaProperties.getItems().get(itemName);
//            if (itemKafkaProperties != null) {
//                properties.putAll(itemKafkaProperties.buildProducerProperties());
//                putAdvanceConfig(properties, itemKafkaProperties.getAdvance());
//            }
//        }
//
//        return properties;
//    }
//
//    private void putAdvanceConfig(Map<String, Object> properties, List<CommonConfigItem> advanceConfig) {
//        if (properties == null || advanceConfig == null) {
//            return;
//        }
//
//        for (CommonConfigItem cci : advanceConfig) {
//            properties.put(cci.getName(), cci.getValue());
//        }
//    }
//
//    private Map<String, Object> buildSpringBootDefaultProducerProperties() {
//        Map<String, Object> properties = new HashMap<>();
//        if (springBootDefaultProperties != null) {
//            properties.putAll(springBootDefaultProperties.buildProducerProperties());
//        }
//
//        return properties;
//    }
//}
