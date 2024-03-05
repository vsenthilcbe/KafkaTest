package com.kafka.kafkatest.handler;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaHandler {

    @KafkaListener(
            id="OrderCreateConsumer",
            topics = "OrderTopic",
            groupId = "OrderGroup"
    )
    public void listen(String payload){
        System.out.println("KafkaHandler.listen"+payload);
    }
}
