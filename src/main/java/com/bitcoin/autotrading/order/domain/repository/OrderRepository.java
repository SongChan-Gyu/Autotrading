package com.bitcoin.autotrading.order.domain.repository;

import com.bitcoin.autotrading.order.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}