package com.klef.jfsd.lab_exam.repo;


import com.klef.jfsd.lab_exam.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
