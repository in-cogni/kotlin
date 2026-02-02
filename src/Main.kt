fun main(){
    //1
    val text: String? = "string"
    text?.let {
        it.printLength()
    }

    //2
    val box = Box().apply {
        width = 10
        height = 5
    }
    box.also{
        println("Объект создан")
    }
    println("Площадь ${box.area()}")

}
fun String.printLength(){
    println("Длина строки: ${this.length}")
}