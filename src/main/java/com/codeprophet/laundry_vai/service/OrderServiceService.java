package com.codeprophet.laundry_vai.service;

import com.codeprophet.laundry_vai.dto.OrderDto;
import com.codeprophet.laundry_vai.dto.OrderServiceDto;

import java.util.List;

public interface OrderServiceService {

    OrderServiceDto create(OrderServiceDto orderServiceDto);

    OrderServiceDto update(OrderServiceDto orderServiceDto);

    void delete(Long id);

    OrderServiceDto findById(Long id);

    List<OrderServiceDto> findAll();


}
