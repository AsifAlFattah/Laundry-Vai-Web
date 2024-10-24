package com.codeprophet.laundry_vai.dto;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.codeprophet.laundry_vai.entity.OrderService}
 */
@Value
public class OrderServiceDto implements Serializable {
    Long id;
    OrderDto order;
    ServiceDto service;
    Integer quantity;
    BigDecimal price;
}