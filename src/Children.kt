//class Children(name: String, age:Int):Person(name, age){
//class Children:Person{
//    constructor(name: String, age: Int):super(name, age)
//}
class Children(name: String, age:Int, val company:String):Person(name, age){
    fun printCompany(){
        print(company)
    }
}