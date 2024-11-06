package com.codeprophet.laundry_vai.service;

import com.codeprophet.laundry_vai.dto.OrderDto;

import java.util.List;

public interface OrderService {

    List<OrderDto> findAll();

    OrderDto findById(Long id);

    OrderDto create(OrderDto orderDto);

    OrderDto update(OrderDto orderDto);

    void delete(Long id);

}
