package com.gjh.learn.h2.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author guangjh
 * @version 1.0
 * @date 2020/12/22 21:49
 */
public class User {

    @Id
    private Long id;

    private String name;

    @ManyToMany(targetEntity = Role.class)
    @JoinTable(name = "USER_ROLE",
            foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT),
            joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles = new HashSet<>();

    public User(Long id, String name) {
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
