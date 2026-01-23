fun main() {
    /*val num:Array<Int> = arrayOf(1, 2 ,3, 3, 4)//явная типизация
    val arr = arrayOf(1, 2, 3, 4)
    var ar = arrayOfNulls<Int>(3)*/

    /*val num = Array(3, {5})//[5, 5, 5]
    val arr = arrayOf(1, 2, 3, 4)
    val n = arr[1]
    println(n)
    arr[2]=7
    println(arr.size)
    for(arr1 in arr){
        println("$arr1 \t")
    }
    var boo = 4 in num//false
    print(boo)
    boo = 2 !in arr//false
    print(boo)
    val nu: IntArray = intArrayOf(1,2,3,4,5)*/
    some("df")
    some("La", sur = "Joe", age = 24)

    fun sime() {
        print("lala")
    }
    sime()

    var nums = intArrayOf(1, 2, 3, 4)
    duble(nums)
    print(nums[0])

    printString("Tom", "Bob", "Anna")
    printString("Tom", "Bob", "Anna", "Lef")
    printString("Tom", "Lef")

    sum(1, 2, 3, 4)
    sum(1, 2, 3, 4, 5, 4, 2)

    printUser(3, "Tom", "Bob", "Anna")

    val a = so(2, 4)
}

fun some(name: String, age: Int = 18, sur: String = "manager") {
    println(name + " " + age + " " + sur)
}

fun duble(numbers: IntArray) {
    numbers[0] = numbers[0] * 2
    println("Value ${numbers[0]}")
}

fun printString(vararg string: String) {
    for (str in string) {
        println(str)
    }
}

fun sum(vararg num: Int) {
    var res = 0
    for (n in num) {
        res += n
    }
    println(res)
}

fun printUser(count: Int, vararg users:String){
    println(count)
    for(user in users){
        println(user)
    }
}

fun so(x:Int, y:Int):Int{
    return x+y
}
fun so(x: Double, y: Double): Double{
    return x+y
}