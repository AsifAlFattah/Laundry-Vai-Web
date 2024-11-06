package com.codeprophet.laundry_vai.controller;

import com.codeprophet.laundry_vai.dto.OrderDto;
import com.codeprophet.laundry_vai.dto.response.ApiResponse;
import com.codeprophet.laundry_vai.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("")
    public ResponseEntity<ApiResponse<List<OrderDto>>> getAllOrders() {
        return ResponseEntity.ok(new ApiResponse<>("success", "Orders fetched successfully", orderService.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<OrderDto>> getOrderById(@PathVariable Long id) {
        OrderDto order = orderService.findById(id);
        return ResponseEntity.ok(new ApiResponse<>("success", "Order fetched successfully", order));
    }

    @PostMapping("")
    public ResponseEntity<ApiResponse<OrderDto>> createOrder(@RequestBody OrderDto orderDto) {
        OrderDto order = orderService.create(orderDto);
        return ResponseEntity.ok(new ApiResponse<>("success", "Order created successfully", order));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDto> updateOrder(@PathVariable Long id, @RequestBody OrderDto orderDto) {
        orderDto.setId(id);
        OrderDto updatedOrder = orderService.update(orderDto);
        return ResponseEntity.ok(updatedOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteOrder(@PathVariable Long id) {
        orderService.delete(id);
        return ResponseEntity.ok(new ApiResponse<>("success", "Order deleted successfully", null));
    }

}
