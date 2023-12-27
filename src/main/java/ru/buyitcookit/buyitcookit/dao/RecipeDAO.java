package ru.buyitcookit.buyitcookit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.buyitcookit.buyitcookit.entity.Recipe;

import java.util.Optional;

@Transactional(readOnly = true)
public interface RecipeDAO extends JpaRepository<Recipe, Integer> {
    @Override
    Optional<Recipe> findById(Integer integer);
}
