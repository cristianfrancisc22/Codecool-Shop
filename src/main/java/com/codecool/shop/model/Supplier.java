package com.codecool.shop.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Supplier extends BaseModel {
    private final List<Product> products;

    public Supplier(String name, String description) {
        super(name,description);
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        return String.format("id: %1$d, " +
                        "name: %2$s, " +
                        "description: %3$s",
                this.id,
                this.name,
                this.description
        );
    }
}