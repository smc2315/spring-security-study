package com.laurentiuspilca.ssia.entity.repository;

import com.laurentiuspilca.ssia.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
