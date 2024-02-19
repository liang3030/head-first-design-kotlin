package headfirst.pattern.design.FactoryPattern.AbstractFactory.Ingredients

interface Dough{
    fun doughType()
}

class ThickDough:Dough{
    override fun doughType() {
        println("thick dough is created")
    }
}

class ThinDough:Dough{
    override fun doughType() {
        println("thin dough is created")
    }
}