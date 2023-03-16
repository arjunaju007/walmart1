package com.walmart.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.walmart.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
