package com.fundoonotes.messaging.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fundoonotes.config.RabbitMQConfig;

@Component
public class RabbitReminderConsumer {

    private static final Logger logger = LoggerFactory.getLogger(RabbitReminderConsumer.class);

    
    // This annotation will make a method as RabbitMQ Consumer
    @RabbitListener(queues = RabbitMQConfig.REMINDER_QUEUE)
    public void handleReminder(ReminderMessageBody messageBody) {

        logger.info(
        		"REMINDER: noteId={}, userId={}, title='{}', reminderAt={}",
        		messageBody.getNoteId(),
        		messageBody.getUserId(),
        		messageBody.getNoteTitle(),
        		messageBody.getReminderAt()   
        );
    }
}