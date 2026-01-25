fun main(){
    //1
    val book1 = Book("Book1", 230)
    val book2 = Book("Book2", -345)

    book1.printData()
    book2.printData()

    book2.pages=-29
    book2.printData()

    //2
    val product1 = Product("Product1", 120.90)
    val product2 = Product("Product2", 129.90)
    val product3 = Product("Product2", 129.90)

    println(product1.toString())
    println(product2.toString())
    println(product3.toString())
    println((product3==product2).toString())
    println((product3==product1).toString())
    product3.applyDiscount(10)
    println(product3.toString())
}