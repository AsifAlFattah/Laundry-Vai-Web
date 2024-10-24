package com.codeprophet.laundry_vai.dto;

import com.codeprophet.laundry_vai.enums.PaymentStatus;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.codeprophet.laundry_vai.entity.Payment}
 */
@Value
public class PaymentDto implements Serializable {
    Long id;
    OrderDto order;
    Double amount;
    PaymentStatus paymentStatus;
    Instant paymentDate;
}