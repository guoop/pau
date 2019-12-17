package com.soft.ware.rest.modular.userlog.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserLogConsumer {
    @KafkaListener(topics = {"userLog"})
    public  void consumer(ConsumerRecord consumerRecord){
        Optional kafkaMsg=  Optional.ofNullable(consumerRecord.value());
        if (kafkaMsg.isPresent()){
            Object msg=  kafkaMsg.get();
            System.err.println(msg);
        }
    }
}
