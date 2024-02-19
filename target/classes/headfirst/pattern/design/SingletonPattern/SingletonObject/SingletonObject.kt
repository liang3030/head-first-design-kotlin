package headfirst.pattern.design.SingletonPattern.SingletonObject

object SingletonObject{
    init {
        println("singleton object is invoked")
    }
    var name = "singleton object"

    fun printName(){
        println(name)
    }
}