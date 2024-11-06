package com.codeprophet.laundry_vai.controller;

import com.codeprophet.laundry_vai.dto.OrderServiceDto;
import com.codeprophet.laundry_vai.dto.response.ApiResponse;
import com.codeprophet.laundry_vai.service.OrderServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-services")
@RequiredArgsConstructor
public class OrderServiceController {

    private final OrderServiceService orderServiceService;

    @GetMapping("")
    public ResponseEntity<ApiResponse<List<OrderServiceDto>>> getAllOrderServices() {
        return ResponseEntity.ok(new ApiResponse<>("success", "Order services fetched successfully", orderServiceService.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<OrderServiceDto>> getOrderServiceById(@PathVariable Long id) {
        OrderServiceDto orderService = orderServiceService.findById(id);
        return ResponseEntity.ok(new ApiResponse<>("success", "Order service fetched successfully", orderService));
    }

    @PostMapping("")
    public ResponseEntity<ApiResponse<OrderServiceDto>> createOrderService(@RequestBody OrderServiceDto orderServiceDto) {
        OrderServiceDto orderService = orderServiceService.create(orderServiceDto);
        return ResponseEntity.ok(new ApiResponse<>("success", "Order service created successfully", orderService));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderServiceDto> updateOrderService(@PathVariable Long id, @RequestBody OrderServiceDto orderServiceDto) {
        orderServiceDto.setId(id);
        OrderServiceDto updatedOrderService = orderServiceService.update(orderServiceDto);
        return ResponseEntity.ok(updatedOrderService);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteOrderService(@PathVariable Long id) {
        orderServiceService.delete(id);
        return ResponseEntity.ok(new ApiResponse<>("success", "Order service deleted successfully", null));
    }

}
