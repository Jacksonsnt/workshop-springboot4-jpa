package com.educweb.course.repositories;

import com.educweb.course.entities.Category;
import com.educweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
