class Book(val title: String, pages: Int) {
    var pages = pages
        set(value) {
            if(value<0){
                field = 0
            }
            else {
                field = value
            }
        }

    fun printData(){
        println("Title=$title, pages=$pages")
    }
}