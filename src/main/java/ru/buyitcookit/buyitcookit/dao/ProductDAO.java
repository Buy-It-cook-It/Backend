package ru.buyitcookit.buyitcookit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.buyitcookit.buyitcookit.entity.Product;

@Transactional(readOnly = true)
public interface ProductDAO extends JpaRepository<Product, Integer> {
}
