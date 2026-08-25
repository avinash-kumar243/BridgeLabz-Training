package com.fundoonotes.messaging.rabbitmq;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReminderMessageBody {
  
	// Message data that will travel through RabbitMQ Components
    private Long noteId;

    private Long userId;

    private String noteTitle;

    private LocalDateTime reminderAt; 
}