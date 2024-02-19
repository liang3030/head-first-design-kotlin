package headfirst.pattern.design.FactoryPattern.GeneralFactory.ConcreteStore

abstract class Pizza(var name :String, var dough : String, var source: String, var toppings: ArrayList<String>){
    fun prepare(){
        println("Preparing : ${name}")
        println("Tossing dough...")
        println("Adding source...")
        println("Adding toppings...")
        for(item in toppings){
            println("Current topping is ${item}")
        }
    }

    fun bake(){
        println("Bake for 25 mins")
    }

    fun cut(){
        println("Cut pizza into slices")
    }

    fun box(){
        println("Place pizza in offical box")
    }
}