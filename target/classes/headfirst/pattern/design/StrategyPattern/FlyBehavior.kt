package headfirst.pattern.design.StrategyPattern

interface FlyBehavior{
    fun fly()
}

class FlyWithWings:FlyBehavior{
    override fun fly() = println("fly with wing")
}

class FlyWithoutWing: FlyBehavior {
    override fun fly() = println("could not fly")
}