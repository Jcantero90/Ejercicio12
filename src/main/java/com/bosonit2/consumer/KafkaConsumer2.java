package com.bosonit2.consumer;

import com.bosonit2.controller.KafkaMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Profile("profileConsumer2")
public class KafkaConsumer2 {

    @Autowired
    KafkaMessageProducer kafkaProducer;

    @KafkaListener(topics="${message.topic.name1:topic1}",  groupId = "${message.group.name:group1}")
    public void listener (String msg){
        System.out.println("recibe mensaje "+ msg);
        kafkaProducer.sendMessage("topic2","mensaje recibido: "+msg);
    }
}
