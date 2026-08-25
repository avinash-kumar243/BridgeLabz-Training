package com.fundoonotes.dto.request;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReminderRequestDto {

	private LocalDateTime reminderAt;
}