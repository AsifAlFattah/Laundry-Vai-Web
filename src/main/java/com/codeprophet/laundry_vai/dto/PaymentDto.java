package com.codeprophet.laundry_vai.dto;

import com.codeprophet.laundry_vai.enums.PaymentStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.codeprophet.laundry_vai.entity.Payment}
 */
@Getter
@Setter
public class PaymentDto implements Serializable {
    Long id;
    OrderDto order;
    Double amount;
    PaymentStatus paymentStatus;
    LocalDateTime paymentDate;
}