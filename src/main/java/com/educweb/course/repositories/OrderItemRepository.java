package com.educweb.course.repositories;

import com.educweb.course.entities.OrderItem;
import com.educweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
