package com.codeprophet.laundry_vai.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.codeprophet.laundry_vai.entity.Feedback}
 */
@Value
public class FeedbackDto implements Serializable {
    Long id;
    UserDto user;
    OrderDto order;
    Double rating;
    String comments;
    Instant createdAt;
}