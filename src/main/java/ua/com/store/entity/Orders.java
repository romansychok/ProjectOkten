package ua.com.store.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Orders extends AbstractEntity{


    private LocalDateTime localDateTime;
    private int totalPrice;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Product> products = new ArrayList<>();

    public Orders() {
    }

    public Orders(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "localDateTime=" + localDateTime +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
