package headfirst.pattern.design.ObserverPattern

class ConcreteObserver(
     val weatherData: WeatherData
) : Display,ObserverP{
    var temperature:Float = 0.0f
    var humidity: Float = 0.0f
    var pressure : Float = 0.0f

    fun subscribe(){
        weatherData.registerObserver(this)
    }

    fun unSubscribe(){
        weatherData.removeObserver(this)
    }

    override fun display() {
        println("temperature: ${this.temperature}")
        println("humidity: ${this.humidity}")
        println("pressure: ${this.pressure}")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
    }
}