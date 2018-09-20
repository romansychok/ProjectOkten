package ua.com.store.service;

import org.springframework.web.multipart.MultipartFile;
import ua.com.store.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product product);
    void delete(int id);
    List<Product> findAll();
    Product findOne(int id);
    Product update(Product product, MultipartFile multipartFile);
    Product update(Product product);
}
