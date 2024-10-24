package com.codeprophet.laundry_vai.repository;

import com.codeprophet.laundry_vai.entity.OrderService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderServiceRepository extends JpaRepository<OrderService, Long> {
}