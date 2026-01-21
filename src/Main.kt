fun main() {
    //1
    val arr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for(num in 1..arr.size step 2){
        println(arr[num])
    }

    //2
    val arr = arrayOf(-3, 1,2, 3, 4,0, 60, 18, 35)
    for(i in arr){
        when{
            i<0 -> println("$i negative")
            i==0 -> println("$i zero")
            i in 1..9 -> println("$i small")
            i>10 -> println("$i big")
        }
    }

    //3
    print("Enter number: ")
    var n = readLine()!!.toInt()
    val arr = (-n..n).toList().toIntArray()
    var a = 0
    for(i in 1 until arr.size step 2){
        a=arr[i]
        when{
            a<0 -> println("$a minus")
            a==0 -> println("$a zero")
            a>0 && a%2==0 -> println("$a even")
            a>0 && a%2!=0 -> println("$a odd")
            else ->println(a)
        }
    }


}