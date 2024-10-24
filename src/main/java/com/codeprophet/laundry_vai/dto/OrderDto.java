package com.codeprophet.laundry_vai.dto;

import com.codeprophet.laundry_vai.entity.Feedback;
import com.codeprophet.laundry_vai.entity.OrderService;
import com.codeprophet.laundry_vai.entity.Payment;
import com.codeprophet.laundry_vai.enums.OrderStatus;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

/**
 * DTO for {@link com.codeprophet.laundry_vai.entity.Order}
 */
@Value
public class OrderDto implements Serializable {
    Long id;
    UserDto user;
    OrderStatus orderStatus;
    Double totalPrice;
    Instant createdAt;
    Instant updatedAt;
    Set<Feedback> feedbacks;
    Set<OrderService> orderServices;
    Set<Payment> payments;
}