package headfirst.pattern.design.FactoryPattern.AbstractFactory

import headfirst.pattern.design.FactoryPattern.AbstractFactory.Ingredients.Cheese
import headfirst.pattern.design.FactoryPattern.AbstractFactory.Ingredients.Dough
import headfirst.pattern.design.FactoryPattern.AbstractFactory.Ingredients.Sauce

interface IngredientFactory{
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
}