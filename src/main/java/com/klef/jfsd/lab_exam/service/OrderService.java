package com.klef.jfsd.lab_exam.service;


import com.klef.jfsd.lab_exam.model.Order;
import com.klef.jfsd.lab_exam.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        if (orderRepository.existsById(order.getOrderId())) {
            throw new IllegalArgumentException("Order ID already exists!");
        }
        return orderRepository.save(order);
    }
}
