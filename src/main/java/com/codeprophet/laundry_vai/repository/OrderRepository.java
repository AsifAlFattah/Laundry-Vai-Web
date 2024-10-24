package com.codeprophet.laundry_vai.repository;

import com.codeprophet.laundry_vai.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}