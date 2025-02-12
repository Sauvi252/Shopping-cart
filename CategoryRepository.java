package com.ecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>
{
   public Boolean existsByName(String name);
}
