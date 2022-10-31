package com.bosonit2.consumer;


import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Profile("profileConsumer")
public class KafkaConsumer {



    @KafkaListener(topics = "${message.topic.name2:topic2}", groupId = "${message.group.name:group1}")
    public void listener (String msg){
        System.out.println("recibe mensaje "+ msg);
    }
}
