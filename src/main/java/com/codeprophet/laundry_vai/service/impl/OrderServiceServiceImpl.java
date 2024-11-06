package com.codeprophet.laundry_vai.service.impl;

import com.codeprophet.laundry_vai.dto.OrderServiceDto;
import com.codeprophet.laundry_vai.mappers.OrderServiceMapper;
import com.codeprophet.laundry_vai.repository.OrderServiceRepository;
import com.codeprophet.laundry_vai.service.OrderServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceServiceImpl implements OrderServiceService {

    private final OrderServiceRepository orderServiceRepository;
    private final OrderServiceMapper orderServiceMapper;

    @Override
    public OrderServiceDto create(OrderServiceDto orderServiceDto) {
        return orderServiceMapper.toDto(orderServiceRepository.save(orderServiceMapper.toEntity(orderServiceDto)));
    }

    @Override
    public OrderServiceDto update(OrderServiceDto orderServiceDto) {
        return orderServiceMapper.toDto(orderServiceRepository.save(orderServiceMapper.toEntity(orderServiceDto)));
    }

    @Override
    public void delete(Long id) {
        orderServiceRepository.deleteById(id);
    }

    @Override
    public OrderServiceDto findById(Long id) {
        return orderServiceRepository.findById(id).map(orderServiceMapper::toDto).orElse(null);
    }

    @Override
    public List<OrderServiceDto> findAll() {
        return orderServiceRepository.findAll().stream().map(orderServiceMapper::toDto).toList();
    }
}
