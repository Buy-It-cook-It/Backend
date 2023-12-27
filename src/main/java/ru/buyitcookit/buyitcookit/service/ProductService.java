package ru.buyitcookit.buyitcookit.service;

import org.springframework.stereotype.Service;
import ru.buyitcookit.buyitcookit.dao.ProductDAO;
import ru.buyitcookit.buyitcookit.entity.Product;

import java.util.List;

@Service
public class ProductService {

    private final ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> getAll() {
        return productDAO.findAll();
    }

    public Product getById(int id) {
        return getAll().stream().filter(o->o.getId() == id).findFirst().get();
    }

    public Product save(Product product) {
        return productDAO.save(product);
    }

    public void delete(int id) {
        productDAO.delete(getById(id));
    }
}
