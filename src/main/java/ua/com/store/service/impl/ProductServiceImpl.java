package ua.com.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.store.dao.ProductDAO;
import ua.com.store.entity.Product;
import ua.com.store.service.ProductService;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO dao;


    @Override
    public void save(Product product) {
        dao.save(product);
    }

    @Override
    public void delete(int id) {
            dao.delete(id);
    }

    @Override
    public List<Product> findAll() {
        return dao.findAll();
    }

    @Override
    public Product findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public void update(Product product) {
        dao.save(product);
    }


}
