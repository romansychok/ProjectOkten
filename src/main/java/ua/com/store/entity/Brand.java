package ua.com.store.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Brand")
public class Brand extends AbstractEntity {


    private String brandName;
    private String brandImage;

    @ManyToOne
    private Country country;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<Product>();


    public Brand() {

    }

    public Brand(String brandName) {
        this.brandName = brandName;
    }




    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
