package com.codeprophet.laundry_vai.controller;

import com.codeprophet.laundry_vai.dto.ServiceDto;
import com.codeprophet.laundry_vai.dto.response.ApiResponse;
import com.codeprophet.laundry_vai.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@RequiredArgsConstructor
public class ServiceController {

    private final ServiceService serviceService;

    @GetMapping("")
    public ResponseEntity<ApiResponse<List<ServiceDto>>> getAllServices() {
        return ResponseEntity.ok(new ApiResponse<>("success", "Services fetched successfully", serviceService.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<ServiceDto>> getServiceById(@PathVariable Long id) {
        ServiceDto service = serviceService.findById(id);
        return ResponseEntity.ok(new ApiResponse<>("success", "Service fetched successfully", service));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<ApiResponse<ServiceDto>> getServiceByName(@PathVariable String name) {
        ServiceDto service = serviceService.findByName(name);
        return ResponseEntity.ok(new ApiResponse<>("success", "Service fetched successfully", service));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiceDto> updateService(@PathVariable Long id, @RequestBody ServiceDto serviceDto) {
        serviceDto.setId(id);
        ServiceDto updatedService = serviceService.update(serviceDto);
        return ResponseEntity.ok(updatedService);
    }

    @PostMapping("")
    public ResponseEntity<ApiResponse<ServiceDto>> createService(@RequestBody ServiceDto serviceDto) {
        ServiceDto service = serviceService.create(serviceDto);
        return ResponseEntity.ok(new ApiResponse<>("success", "Service created successfully", service));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteService(@PathVariable Long id) {
        serviceService.delete(id);
        return ResponseEntity.ok(new ApiResponse<>("success", "Service deleted successfully", null));
    }

}
