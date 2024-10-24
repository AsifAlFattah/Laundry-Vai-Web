package com.codeprophet.laundry_vai.repository;

import com.codeprophet.laundry_vai.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}