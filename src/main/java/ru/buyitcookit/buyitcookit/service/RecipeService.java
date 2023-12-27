package ru.buyitcookit.buyitcookit.service;

import org.springframework.stereotype.Service;
import ru.buyitcookit.buyitcookit.dao.RecipeDAO;
import ru.buyitcookit.buyitcookit.entity.Recipe;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeDAO recipeDAO;

    public RecipeService(RecipeDAO recipeDAO) {
        this.recipeDAO = recipeDAO;
    }

    public List<Recipe> getAll(){
        return recipeDAO.findAll();
    }

    public Recipe getById(Long id){
        return recipeDAO.getReferenceById(Math.toIntExact(id));
    }

    public Recipe save(Recipe recipe){
        return recipeDAO.save(recipe);
    }

    public void delete(Long id){
        recipeDAO.delete(getById(id));
    }
}
