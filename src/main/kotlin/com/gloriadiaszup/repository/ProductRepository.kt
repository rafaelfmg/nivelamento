package com.gloriadiaszup.repository

import com.gloriadiaszup.model.entities.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long>