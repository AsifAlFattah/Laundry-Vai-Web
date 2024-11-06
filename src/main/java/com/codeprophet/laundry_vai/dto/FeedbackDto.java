package com.codeprophet.laundry_vai.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.codeprophet.laundry_vai.entity.Feedback}
 */
@Getter
@Setter
public class FeedbackDto implements Serializable {
    Long id;
    UserDto user;
    OrderDto order;
    Double rating;
    String comments;
    LocalDateTime createdAt;
}