package headfirst.pattern.design.CommandPattern.Devices

abstract class Device(val name: String){
    fun getDeviceName():String {
        return name
    }
    fun deviceOn(){
        println("${name} is on")
    }
    fun deviceOff(){
        println("${name} is off")
    }

}