package com.laurentiuspilca.ssia.service;

import com.laurentiuspilca.ssia.entity.Product;
import com.laurentiuspilca.ssia.entity.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
