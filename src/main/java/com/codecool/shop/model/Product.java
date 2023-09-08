package com.codecool.shop.model;

import lombok.Getter;
import java.math.BigDecimal;


@Getter
public class Product extends BaseModel {

    private BigDecimal defaultPrice;
    private String defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private int quantity;
    private int supplierID;


    public Product(String name, BigDecimal defaultPrice, String currencyString, String description, ProductCategory productCategory, Supplier supplier) {
        super(name, description);
        this.setPrice(defaultPrice, currencyString);
        this.setSupplier(supplier);
        this.setProductCategory(productCategory);
        quantity = 1;
    }

    public Product(String name, BigDecimal defaultPrice, String currencyString, String description, String categoryName, String supplierName, String categoryDepartment
    , String categoryDescription, String supplierDescription) {
        super(name,description);
        this.defaultPrice = defaultPrice;
        this.defaultCurrency =  currencyString;
        this.description = description;
        this.productCategory = new ProductCategory(categoryName,categoryDepartment,categoryDescription);
        this.supplier = new Supplier(supplierName,supplierDescription);
    }

    public Product(String name, BigDecimal defaultPrice, String currencyString, String description, ProductCategory productCategory, int supplierID) {
        super(name,description);
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = currencyString;
        this.description = description;
        this.productCategory = productCategory;
        this.supplierID = supplierID;
    }

    public String getPrice() {
        return this.defaultPrice + " " + this.defaultCurrency;
    }

    public void setPrice(BigDecimal price, String currency) {
        this.defaultPrice = price;
        this.defaultCurrency = currency;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
        this.productCategory.addProduct(this);
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
        this.supplier.addProduct(this);
    }


    @Override
    public String toString() {
        return String.format("id: %1$d, " +
                        "name: %2$s, " +
                        "defaultPrice: %3$f, " +
                        "defaultCurrency: %4$s, " +
                        "productCategory: %5$s, " +
                        "supplier: %6$s",
                this.id,
                this.name,
                this.defaultPrice,
                this.defaultCurrency,
                this.productCategory.getName(),
                this.supplier.getName());
    }
}
