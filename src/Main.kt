fun main(){
    println(getLength("Hohoho"))
    println(getLength(null))
    println(getLength(""))

    println(any("abc"))
    println(any(4))
    println(any(null))
    println(any(2.5))
}
fun getLength(str: String?):Int{
    return str?.length ?:0
}
fun any(value: Any?):Int{
    val str = value as? String
    if(str!=null){
        return str.length
    }
    val num = value as? Int
    if(num!=null){
        return num*num
    }
    if(value==null){
        return -1
    }
    return 0
}