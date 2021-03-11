package com.ecommerce.hrcatalog.services;

import com.ecommerce.hrcatalog.Entities.Product;
import com.ecommerce.hrcatalog.dtos.ProductDTO;
import com.ecommerce.hrcatalog.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public Page<ProductDTO> findPageable(Pageable pageable) {
        Page<Product> page = repository.findAll(pageable);
        Page<ProductDTO> pageDTO = page.map( p -> modelMapper.map(p, ProductDTO.class));
        return pageDTO;
    }
}
