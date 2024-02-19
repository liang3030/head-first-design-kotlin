package headfirst.pattern.design.StrategyPattern

interface QuackBehavior{
    fun quack()
}

class Quack:QuackBehavior{
    override fun quack() = println("quack")
}

class Squeak : QuackBehavior {
    override fun quack() = println("Squeak")
}