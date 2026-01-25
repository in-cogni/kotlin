data class Product(var name: String, var _price: Double){
    var price: Double = if (_price<0) 0.0 else _price
        set(value) {
            if (value < 0) {
                field = 0.0
            } else {
                field = value
            }
        }
    fun applyDiscount(percent: Int){
        _price -= (_price*percent)/100
    }
}
