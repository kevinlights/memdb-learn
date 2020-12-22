package com.gjh.learn.h2.domain;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author guangjh
 * @version 1.0
 * @date 2020/12/22 21:01
 */
@Entity
public class Product {

    @Id
    private Long id;
    private String name;

    public Product() {
    }

    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
