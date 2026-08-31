package com.educweb.course.repositories;

import com.educweb.course.entities.Order;
import com.educweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
