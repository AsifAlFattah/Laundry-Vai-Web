package com.codeprophet.laundry_vai.service.impl;

import com.codeprophet.laundry_vai.dto.ServiceDto;
import com.codeprophet.laundry_vai.mappers.ServiceMapper;
import com.codeprophet.laundry_vai.repository.ServiceRepository;
import com.codeprophet.laundry_vai.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;
    private final ServiceMapper serviceMapper;

    @Override
    public ServiceDto create(ServiceDto serviceDto) {
        return serviceMapper.toDto(serviceRepository.save(serviceMapper.toEntity(serviceDto)));
    }

    @Override
    public ServiceDto update(ServiceDto serviceDto) {
        return serviceMapper.toDto(serviceRepository.save(serviceMapper.toEntity(serviceDto)));
    }

    @Override
    public void delete(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public ServiceDto findById(Long id) {
        return serviceRepository.findById(id).map(serviceMapper::toDto).orElse(null);
    }

    @Override
    public ServiceDto findByName(String name) {
        return serviceRepository.findByName(name).map(serviceMapper::toDto).orElse(null);
    }

    @Override
    public List<ServiceDto> findAll() {
        return serviceRepository.findAll().stream().map(serviceMapper::toDto).toList();
    }
}
