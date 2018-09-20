package ua.com.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import ua.com.store.dao.ProductDAO;
import ua.com.store.entity.Product;
import ua.com.store.service.ProductService;

import java.io.File;
import java.io.IOException;
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
    public Product update(Product product, MultipartFile image) {
        product.setProductName(product.getProductName() + "U");

        String path = System.getProperty("user.home") + File.separator + "projectImages\\";

        try {
            image.transferTo(new File(path + image.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        product.setPathImage("\\images\\" + image.getOriginalFilename());

        for (int i = 0; i < product.getProductName().length() ; i++) {
                String[] s = product.getProductName().split("U");
                product.setProductName(s[0]);
        }
            return dao.save(product);

    }

    @Override
    public Product update(Product product) {
        return dao.save(product);
    }


}
