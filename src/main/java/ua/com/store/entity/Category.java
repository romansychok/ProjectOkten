package ua.com.store.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Category")
public class Category extends AbstractEntity {

    private String categoryOfProduct;

    @OneToMany(mappedBy = "category")
    private Set<Product> products = new HashSet<>();

    public Category() {
    }

    public Category(String categoryOfProduct) {
        this.categoryOfProduct = categoryOfProduct;
    }

    public String getCategoryOfProduct() {
        return categoryOfProduct;
    }

    public void setCategoryOfProduct(String categoryOfProduct) {
        this.categoryOfProduct = categoryOfProduct;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryOfProduct='" + categoryOfProduct + '\'' +
                '}';
    }
}
