package com.fundoonotes.messaging.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.fundoonotes.config.RabbitMQConfig;

@Component 
public class RabbitReminderProducer {

    private final RabbitTemplate rabbitTemplate;

    // Constructor Injection 
    public RabbitReminderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate; 
    } 

    
    public void sendReminder(ReminderMessageBody messageBody) {
 
    		rabbitTemplate.convertAndSend(
                RabbitMQConfig.REMINDER_QUEUE,
                messageBody 
        );
    }
}