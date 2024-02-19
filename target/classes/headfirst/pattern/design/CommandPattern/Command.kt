package headfirst.pattern.design.CommandPattern

interface Command {
    fun execute()
    fun undo()
}