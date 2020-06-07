package com.example.cruso1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cruso1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
