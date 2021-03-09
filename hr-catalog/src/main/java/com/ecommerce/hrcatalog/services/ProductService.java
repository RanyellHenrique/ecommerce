package com.ecommerce.hrcatalog.services;

import com.ecommerce.hrcatalog.Entities.Product;
import com.ecommerce.hrcatalog.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Page<Product> findPageable(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
