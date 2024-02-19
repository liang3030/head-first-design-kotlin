package headfirst.pattern.design.ObserverPattern

interface Subject{
    fun registerObserver(obs:ObserverP)
    fun removeObserver(obs:ObserverP)
    fun notifyObserver()

}

