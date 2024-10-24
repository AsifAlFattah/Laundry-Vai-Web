package com.codeprophet.laundry_vai.repository;

import com.codeprophet.laundry_vai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}