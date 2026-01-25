open class Person(_name: String, _age: Int) {
    var age:Int = 18
    var name: String = "anna"

    open val fullInfo: String
        get()="Person - $name - $age"

    open var agee:Int = 1
        set(value){
            if(value in 1..109) field = value
        }
    /*constructor(_name: String, _age: Int) {
        this.name = _name
        this.age = _age
    }*/

    /*constructor(_name: String) {
        this.name = _name
    }*/


    fun sayHello(){
        print("Hello $name")
    }

    fun go(location: String) {
        print("$name go to $location")
    }

    fun personToString(): String{
        return "Name $name Age $age"
    }

}