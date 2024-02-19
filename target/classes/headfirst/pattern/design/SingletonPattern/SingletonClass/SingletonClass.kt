package headfirst.pattern.design.SingletonPattern.SingletonClass

class SingletonClass {
    init {
        println("singleton class is initiate")
    }

    companion object {
        init {
            println("companion object is initiate")
        }
        var name = "singleton class"
        fun printName(){
            println(name)
        }
    }

    object singleton {
        init {
            println("object is initiate")
        }
    }
}