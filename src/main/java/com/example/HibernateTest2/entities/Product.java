package com.example.HibernateTest2.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {
    @Id
    private int id;
    private String desc;

    // public Product(int id, String desc) {
    // this.id = id;
    // this.desc = desc;
    // }

    @Override
    public String toString() {
        return "Product [id=" + id + ", desc=" + desc + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
