import kotlin.reflect.KProperty

fun main(){
    /*val hello: String = "Hello"
    println(hello.wordCount('l'))
    println(hello.wordCount('o'))
    println(4.square())
    println(6.square())*/
    /*val counter1 = Counter(5)
    val counter2 = Counter(7)

    val result = counter1>counter2
    val counter3:Counter=counter1+counter2*/

    /*val tom=Person("Tom")
    println(tom.name)*/

    val sam = Human("Sam", "123@gmail.com", null)
    val tom = Human("Tom", null, null )

    //let - проверкм на null/преобразование значений
    //принимает this, возвращает результат
    sam.email?.let(::println)
    //analog
    //if (sam.email!=null) println("EMAIL ${sam.email}")
    tom.email?.let { println("Email $it") }

    //with - надо выполнить над объектом набор операций как единое целое
    // - применяется для установки свойств объектов (если через конструктор были переданы некорректные значения
    //принимает this, возвращает результат
    with(tom){
        if (email==null) email="${name.lowercase()}@qmail.com"
        if (age !in 1..110) age = 18
    }
    println("${tom.name} (${tom.age})-${tom.email}")

    //run - выполнение и получения результата
    val emailTom = tom.run{
        if (email==null) email="${name.lowercase()}@qmail.com"
        email
    }
    println(emailTom)

    //apply - построение(настройка) объекта
    //принимает it, возвращает результат
    tom.apply {
        if (email==null) email="${name.lowercase()}@qmail.com"
    }
    println(tom.email)
    val bob = Employee()
    bob.name("bob")
    bob.age(26)
    bob.company("Google")
    println("${bob.name} (${bob.age})-${bob.company}")

    //also - принимает it возващает объект
    //дополнительное действие
    val joe = Human("Joe", null, null)
    joe.also{
        if(it.email==null){
            it.email = "${it.name.lowercase()}%gmail.com"
        }
    }
    println(tom.email)

    //отличия this/it:
    //it - явно указываем имя (tom.name)
    //this - не нужно указывать(name)
}
data class Human(val name:String, var email: String?, var age:Int?)
data class Employee(var name:String="", var age:Int = 0, var company:String=""){
    fun name(_name: String):Employee = apply{name=_name}
    fun age(_age:Int):Employee = apply{age=_age}
    fun company(_company: String):Employee = apply{company=_company}

}

class Person(_name:String){
    val name: String by Logger(_name)
}
class Logger(val _personName: String){
    operator fun getValue(thisRef:Person, property: KProperty<*>): String{
        println("Запрошено св-во +${property.name}")
        println("Установить значение +${_personName}")
        return "Tom"
    }
}

fun String.wordCount(c:Char):Int{
    var count=0
    for (n in this){
        if (n==c){
            count++
        }
    }
    return count
}

fun Int.square():Int{
    return this*this
}