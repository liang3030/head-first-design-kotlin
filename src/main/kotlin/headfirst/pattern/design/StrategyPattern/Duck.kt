package headfirst.pattern.design.StrategyPattern

abstract class Duck(var flyBehavior: FlyBehavior, var quackBehavior: QuackBehavior) {

    fun swim() = println("Swim")
    abstract fun display()

    fun performFly() = flyBehavior.fly()
    fun performQuack() = quackBehavior.quack()
}

class MallardDuck() : Duck(FlyWithWings(), Quack()) {
    override fun display() = println("Display MallardDuck")
}


