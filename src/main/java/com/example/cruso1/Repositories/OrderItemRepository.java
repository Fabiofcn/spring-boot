package com.example.cruso1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cruso1.entities.OrderItem;
import com.example.cruso1.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
