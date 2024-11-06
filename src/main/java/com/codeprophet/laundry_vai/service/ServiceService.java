package com.codeprophet.laundry_vai.service;

import com.codeprophet.laundry_vai.dto.ServiceDto;

import java.util.List;

public interface ServiceService {

        ServiceDto create(ServiceDto serviceDto);

        ServiceDto update(ServiceDto serviceDto);

        void delete(Long id);

        ServiceDto findById(Long id);

        ServiceDto findByName(String name);

        List<ServiceDto> findAll();
}
