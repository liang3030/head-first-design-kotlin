package headfirst.pattern.design.ObserverPattern

class WeatherData(
    private var observerList: ArrayList<ObserverP>
): Subject {
    var temperature:Float = 0.0f
    var humidity: Float = 0.0f
    var pressure : Float = 0.0f

    override fun registerObserver(obs: ObserverP) {
        observerList.add(obs)
    }

    override fun removeObserver(obs: ObserverP) {
        observerList.remove(obs)
    }

    override fun notifyObserver() {
        observerList.map{
            it.update(this.temperature, this.humidity, this.pressure)
        }
    }

    fun measurementChanged(){
        notifyObserver()
    }

    fun setWeatherData(temperature: Float,humidity : Float, pressure: Float){
        this.humidity = humidity
        this.temperature = temperature
        this.pressure = pressure
        measurementChanged()
    }
}