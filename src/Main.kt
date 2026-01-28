import java.io.FileInputStream

fun main() {
    try{
        val n1 = 1
        val n2 = 0
        val result=n1/n2
    }catch(e: Exception){
        println(e.message)
        for(line in e.stackTrace){
            println("at $line")
        }
    }finally {
        println("finally")
    }

    val stream = FileInputStream("")
    try{
        //
    }finally {
        stream.close()
    }

    var n:Int? = null
    n = 34

    var name: String = "Tom"
    val user: String = name?:"Uknown"

    val s: String = "12"
    val d: Int = s.toInt()
    println(d)
}
fun test(): Int{
    try{//вернет 2
        return 1
    }finally {
        return 2
    }
}