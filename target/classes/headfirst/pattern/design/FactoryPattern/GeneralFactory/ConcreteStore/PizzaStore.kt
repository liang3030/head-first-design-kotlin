package headfirst.pattern.design.FactoryPattern.GeneralFactory.ConcreteStore

import headfirst.pattern.design.FactoryPattern.GeneralFactory.ConcreteStore.Pizza

abstract class PizzaStore (){
    fun pizzaOrder(type: String): Pizza {
        val pizza = createPizza(type)
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    abstract fun createPizza(type: String) : Pizza
}