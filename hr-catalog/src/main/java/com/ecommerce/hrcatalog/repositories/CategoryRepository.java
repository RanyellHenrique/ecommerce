package com.ecommerce.hrcatalog.repositories;

import com.ecommerce.hrcatalog.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
