package com.gjh.learn.h2;

import com.gjh.learn.h2.domain.Product;
import com.gjh.learn.h2.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * @author guangjh
 * @version 1.0
 * @date 2020/12/22 21:24
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class EntityTest {


    @Autowired
    ProductRepository productRepository;

    @Before
    public void initData() {
        productRepository.save(new Product(1l, "aaa"));
        productRepository.save(new Product(2l,"bbb"));
        productRepository.save(new Product(3l, "ccc"));
        productRepository.save(new Product(4l, "ddd"));
        productRepository.save(new Product(5l, "eee"));
    }

    @Test
    public void testfind() {
        Optional<Product> prod = productRepository.findById((long) 1);
        Long id = prod.get().getId();
    }

}
