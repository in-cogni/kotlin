import java.util.HashSet

fun main(){
    /*var numbers = listOf(1, 2, 3, 4, 5)//List<Int>
    var people = listOf("Tom", "Bob", "Jake", "Joe", "Kate", "Martin")//List<Int>

    val first = people.get(1)
    val first1 = people.get(0)
    val first2 = people.getOrElse(10) {"Undefined"}
    val first3 = people.getOrNull(10)
    println("$first, $first1, $first2, $first3")

    for (peopleList in people){
        println(peopleList)
    }

    val subPeople=people.subList(1, 4)
    println(subPeople)*/

    /*var numbers1: ArrayList<Int> = arrayListOf(1,2,3,4,5)
    var numbers2: MutableList<Int> = mutableListOf(1,2,3,4,5)
    numbers2.add(4)
    numbers2.add(0, 23)
    numbers2.addAll(0, listOf(-3,-2,-1))
    numbers2.removeAt(0)
    numbers2.remove(5)
    println(numbers2)
    numbers2.clear()*/

    /*var numbers = setOf(2, 3, 4)
    var people1=setOf("Tom", "Sam", "Bob")
    var people2=setOf("Tom", "Tuk", "Joe")
    var peopleList = listOf("Tom", "Bob", "Tom", "Joe", "Kate", "Martin")//List<Int>
    val unique = peopleList.toSet()
    println(unique)

    val all=people1.union(people2)
    val common = people1.intersect(people2)
    val different = people1.subtract(people2)
    println("$all\n$common\n$different")*/

    /*val num: MutableSet<Int> = mutableSetOf(35,36,37)
    val num1: HashSet<Int> = hashSetOf(35,36,37)

    val people = mapOf(1 to "Alex", 2 to "Andrew")//Map<Int, String>
    for (per in people){
        println("${per.key} ${per.value}")
    }
    println(people)
    val a = people.get(1)
    println(a)

    val people1 = mutableMapOf(1 to "Alex", 2 to "Joe")
    people1.put(3, "Mike")
    println(people1)
    people1.set(3, "Tom")
    println(people1)*/

    /*val people = sequenceOf("Joe", "Barb", "Pol")//Sequence<String>
    println(people.joinToString())
    println((people.asSequence()).joinToString())*/


}