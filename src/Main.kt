fun main() {
    //1
    val arr: Array<Int> = arrayOf(1, 2, 3, 4, 2)
    val s = sum(arr)
    println("№1: sum=${s}")

    //2
    var m = max(1, 2, 3, 1, 9, 0, 2)
    println("№2: max=${m}")
    m  = max(2, 6)
    println("\tmax=${m}")

    //3
    val arr1: IntArray = intArrayOf(1, 4, 56, 23, 98)
    val arr2: IntArray = filterEven(arr1)
    print("№3: ")
    printNumbers(*arr2)
}
fun sum(numbers: Array<Int>): Int{
    var s = 0
    for(i in numbers){
        s+=i
    }
    return s
}

fun max(vararg num: Int):Int{
    var maxValue = num[0]
    for(i in num){
        if(i > maxValue){
            maxValue = i
        }
    }
    return maxValue
}

fun filterEven(arr: IntArray): IntArray{
    val newArr = IntArray(arr.size)

    var i = 0
    for(n in arr){
        if(n%2==0){
            newArr[i] = n
            i++
        }
    }
    return newArr.copyOfRange(0, i)
}

fun printNumbers(vararg num:Int){
    for(n in num){
        print("${n} ")
    }
    println()
}