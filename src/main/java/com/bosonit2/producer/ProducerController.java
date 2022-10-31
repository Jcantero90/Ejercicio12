package com.bosonit2.producer;

import com.bosonit2.controller.KafkaMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {
    @Autowired
    KafkaMessageProducer kafkaMessageProducer;

    @PostMapping("/add/{topic}")
    public void addIdCustomer (@PathVariable ("topic") String topic, @RequestBody String body){
        kafkaMessageProducer.sendMessage(topic, body);
    }
}
