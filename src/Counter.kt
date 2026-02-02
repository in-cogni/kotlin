class Counter (var value:Int) {
    operator fun compareTo(counter: Counter): Int{
        return this.value - counter.value
    }

    operator fun plus(counter: Counter): Counter{
        return Counter(this.value+counter.value)
    }
}
