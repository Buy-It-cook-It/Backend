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

    public Recipe getById(int id){
        return getAll().stream().filter(o->o.getId()==id).findFirst().get();
    }

    public Recipe save(Recipe recipe){
        return recipeDAO.save(recipe);
    }

    public void delete(int id){
        recipeDAO.delete(getById(id));
    }
}
