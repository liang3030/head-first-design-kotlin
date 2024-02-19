package headfirst.pattern.design.FactoryPattern.GeneralFactory.ConcreteStore

import headfirst.pattern.design.FactoryPattern.GeneralFactory.ConcreteStore.StyledPizza.StyledCheesePizza
import headfirst.pattern.design.FactoryPattern.GeneralFactory.ConcreteStore.StyledPizza.StyledClamPizza
import headfirst.pattern.design.FactoryPattern.GeneralFactory.ConcreteStore.StyledPizza.StyledVeggiePizza

class NYStore : PizzaStore() {
  override fun createPizza(type:String): Pizza {
    lateinit var styledPizza: Pizza

    when(type){
        "cheese"-> styledPizza = StyledCheesePizza()
        "clam"-> styledPizza = StyledClamPizza()
        else->styledPizza = StyledVeggiePizza()
    }
      return styledPizza
  }
}