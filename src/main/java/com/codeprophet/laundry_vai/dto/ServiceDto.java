package com.codeprophet.laundry_vai.dto;

import com.codeprophet.laundry_vai.entity.OrderService;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

/**
 * DTO for {@link com.codeprophet.laundry_vai.entity.Service}
 */
@Getter
@Setter
public class ServiceDto implements Serializable {
    Long id;
    String name;
    String imageUrl;
    String description;
    BigDecimal price;
    Boolean availability;
}