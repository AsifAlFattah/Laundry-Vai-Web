package com.codeprophet.laundry_vai.repository;

import com.codeprophet.laundry_vai.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}