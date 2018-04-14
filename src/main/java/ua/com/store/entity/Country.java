package ua.com.store.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Country")
public class Country extends AbstractEntity{

    private String countryName;

    @OneToMany(mappedBy = "country")
    private Set<Brand> brands = new HashSet<>();


    public Country() {
    }

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Set<Brand> getBrands() {
        return brands;
    }

    public void setBrands(Set<Brand> brands) {
        this.brands = brands;
    }


    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                '}';
    }
}
