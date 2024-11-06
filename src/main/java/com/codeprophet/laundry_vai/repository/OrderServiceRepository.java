package com.codeprophet.laundry_vai.repository;

import com.codeprophet.laundry_vai.entity.OrderService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderServiceRepository extends JpaRepository<OrderService, Long>, JpaSpecificationExecutor<OrderService> {
}