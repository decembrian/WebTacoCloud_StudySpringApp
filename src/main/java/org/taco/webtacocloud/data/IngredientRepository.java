package org.taco.webtacocloud.data;

import org.springframework.data.repository.CrudRepository;

import org.taco.webtacocloud.model.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}
