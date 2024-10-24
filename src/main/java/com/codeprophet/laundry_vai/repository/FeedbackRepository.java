package com.codeprophet.laundry_vai.repository;

import com.codeprophet.laundry_vai.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}