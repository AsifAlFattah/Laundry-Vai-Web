package com.codeprophet.laundry_vai.mappers;

import com.codeprophet.laundry_vai.dto.OrderServiceDto;
import com.codeprophet.laundry_vai.entity.OrderService;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderServiceMapper {
    OrderService toEntity(OrderServiceDto orderServiceDto);

    OrderServiceDto toDto(OrderService orderService);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    OrderService partialUpdate(OrderServiceDto orderServiceDto, @MappingTarget OrderService orderService);
}