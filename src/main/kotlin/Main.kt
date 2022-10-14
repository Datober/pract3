import kotlin.random.Random

fun main() {
    // Задача 1
    val myAge = 18
    val isTeeneger: Boolean = myAge in 13..19
    // Задача 2
    val theirAge = 30
    val bothTeenagers: Boolean = isTeeneger == theirAge in 13..19
    // Задача 3
    val reader = "Давид"
    val author = "Richard Lucas"
    val authorlsReader = reader == author
    // Задача 4
    val readerBeforeAuthor = reader > author
    // Задача 5
    val myAge2 = 18
    if (myAge2 in 13.. 19)
        println("Подросток")
    else
        println("Не подросток")
    // Задача 6
    val answer = if(myAge2 in 13..19) "Подросток" else "Не подросток"
    println(answer)
    // Задача 7
    var counter = 0
    while (counter<10) {
        var x:Int = counter
        counter+=1
        println(counter)
    }
    // Задача 8
    var roll = 0
    do
    {
        roll = Random.nextInt(6)
        counter += 1
        println("После $counter бросков, roll равен $roll")
    } while (roll != 0)
    // Задача 9
    val range=1..10
    for (i in range)
        println(i*i)
    //Задача 10
    for (i in range)

        println(Math.sqrt(i.toDouble()))

    //Задача 11
    var sum = 0
    for (row in 1 until 8 step 2)
    {
        for (column in 0 until 8)
        {
            sum += row * column
        }
    }
    println(sum)
}