package headfirst.pattern.design

import headfirst.pattern.design.FactoryPattern.AbstractFactory.CheesePizzaIngredientFactory
import headfirst.pattern.design.FactoryPattern.GeneralFactory.ConcreteStore.NYStore
import headfirst.pattern.design.ObserverPattern.ConcreteObserver
import headfirst.pattern.design.ObserverPattern.ObserverP
import headfirst.pattern.design.ObserverPattern.WeatherData
import headfirst.pattern.design.SingletonPattern.SingletonClass.SingletonClass
import headfirst.pattern.design.SingletonPattern.SingletonObject.SingletonObject
import headfirst.pattern.design.StrategyPattern.MallardDuck

fun main(args: Array<String>) {
//    Strategy pattern
    val duckInstance = MallardDuck()
    duckInstance.display()
    duckInstance.performFly()

//    Observer pattern
    val observers : ArrayList<ObserverP> = ArrayList();
    val weatherData = WeatherData(observers)
    val observer = ConcreteObserver(weatherData)
    println(observer)
    observer.subscribe()
    weatherData.setWeatherData(12.0f, 22.3f, 11.3f)
    observer.display()
    weatherData.setWeatherData(5.0f, 12.3f, 1.3f)
    observer.display()

//    Factory pattern
    val nyPizzaStore = NYStore()
    val curPizza = nyPizzaStore.pizzaOrder("cheese")
    curPizza.prepare()

//  Singleton pattern
    SingletonObject.printName()
    SingletonClass.printName()
    SingletonClass.singleton

}


