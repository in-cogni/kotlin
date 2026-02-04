import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

val scope = CoroutineScope(Dispatchers.Default)
suspend fun main() = coroutineScope{
    /*launch {doWork()}
    val a = async { loadA() }
    val b = async { loadB() }
    val c = a.await()+b.await()
    println("Hello World")*/
    val job = scope.launch {
        repeat(10){
            delay(1000L)
            println(it)
        }
    }
    job.cancel()
}
suspend fun doWork()
{
    for (i in 0..5) {
        delay(400L)
        println(i)
    }
}
suspend fun loadA(): Int{
    delay(1000L)
    return 10
}
suspend fun loadB(): Int{
    delay(1000L)
    return 20
}