package ru.buyitcookit.buyitcookit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.buyitcookit.buyitcookit.entity.Recipe;

@Transactional(readOnly = true)
public interface RecipeDAO extends JpaRepository<Recipe, Integer> {
}
