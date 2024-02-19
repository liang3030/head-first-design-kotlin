package headfirst.pattern.design.FactoryPattern.AbstractFactory

import headfirst.pattern.design.FactoryPattern.AbstractFactory.Ingredients.*

class CheesePizzaIngredientFactory : IngredientFactory{
    override fun createCheese(): Cheese {
        val cheese = MozzarellaCheese()
        return cheese
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createDough(): Dough {
        return ThinDough()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createSauce(): Sauce {
        return TunaSauce()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
