package headfirst.pattern.design.FactoryPattern.AbstractFactory.Ingredients

interface Sauce{
    fun sauceType()
}

class TomatoSauce:Sauce{
    override fun sauceType() {
        println("tomato source is created")
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class TunaSauce:Sauce{
    override fun sauceType() {
        println("tuna source is created")
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}