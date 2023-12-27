package ru.buyitcookit.buyitcookit.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.buyitcookit.buyitcookit.entity.Recipe;
import ru.buyitcookit.buyitcookit.service.RecipeService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(name = "/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/{id}")
    public Recipe get(@PathVariable int id) {
        return recipeService.getById(id);
    }

    @GetMapping
    public List<Recipe> getAll() {
        return recipeService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Recipe> createWithLocation(@RequestBody Recipe recipe) {
        Recipe created = recipeService.save(recipe);

        URI uriOfNewResource = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/recipe/{id}")
                .buildAndExpand(created.getId()).toUri();

        return ResponseEntity.created(uriOfNewResource).body(created);
    }
}
