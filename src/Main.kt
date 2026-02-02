fun main(){
    //1
    val numbers = listOf(1, 2, 3, 2, 4, 3)
    val setNumbers = numbers.toMutableSet()
    setNumbers.add(10)
    println(setNumbers.toList())

    //2
    val words = listOf(
        "apple", "banana", "apple",
        "orange", "banana", "apple"
    )
    val wordCount = mutableMapOf<String, Int>()
    for (word in words){
        val count = wordCount[word]?:0
        wordCount[word] = count+1
    }
    val resultMap: Map<String, Int> = wordCount
    val repeatedWords = mutableSetOf<String>()
    for ((word,count) in wordCount){
        if (count>1){
            repeatedWords.add(word)
        }
    }
    val resultSet:Set<String> = repeatedWords
    println("Кол-во слов $resultMap")
    println("Повторяющиеся слова $resultSet")
}