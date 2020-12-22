package com.gjh.learn.h2.repository;

import com.gjh.learn.h2.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author guangjh
 * @version 1.0
 * @date 2020/12/22 21:26
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
