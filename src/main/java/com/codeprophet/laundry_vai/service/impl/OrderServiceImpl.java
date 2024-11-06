package com.codeprophet.laundry_vai.service.impl;

import com.codeprophet.laundry_vai.dto.OrderDto;
import com.codeprophet.laundry_vai.mappers.OrderMapper;
import com.codeprophet.laundry_vai.repository.OrderRepository;
import com.codeprophet.laundry_vai.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public List<OrderDto> findAll() {
        return orderRepository.findAll().stream().map(orderMapper::toDto).toList();
    }

    @Override
    public OrderDto findById(Long id) {
        return orderRepository.findById(id).map(orderMapper::toDto).orElse(null);
    }

    @Override
    public OrderDto create(OrderDto orderDto) {
        return orderMapper.toDto(orderRepository.save(orderMapper.toEntity(orderDto)));
    }

    @Override
    public OrderDto update(OrderDto orderDto) {
        return orderMapper.toDto(orderRepository.save(orderMapper.toEntity(orderDto)));
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
