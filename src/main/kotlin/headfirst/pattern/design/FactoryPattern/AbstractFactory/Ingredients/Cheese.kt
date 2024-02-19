package headfirst.pattern.design.FactoryPattern.AbstractFactory.Ingredients

interface Cheese{
    fun cheeseType()
}

class MozzarellaCheese:Cheese{
    override fun cheeseType() {
        println("Mozzarella cheese is created")
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}