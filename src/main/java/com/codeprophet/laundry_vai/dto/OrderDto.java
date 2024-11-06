package com.codeprophet.laundry_vai.dto;

import com.codeprophet.laundry_vai.entity.Feedback;
import com.codeprophet.laundry_vai.entity.OrderService;
import com.codeprophet.laundry_vai.entity.Payment;
import com.codeprophet.laundry_vai.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * DTO for {@link com.codeprophet.laundry_vai.entity.Order}
 */
@Getter
@Setter
public class OrderDto implements Serializable {
    Long id;
    UserDto user;
    OrderStatus orderStatus;
    Double totalPrice;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}