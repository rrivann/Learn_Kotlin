package functional_programming

fun main() {
    val numbers = listOf(1, 2, 3)
//    val fold = numbers.fold(10) { current, item ->
//        println("current $current")
//        println("item $item")
//        println()
//        current + item
//    }

//    println("Fold result: $fold")
//
//    val foldRigth = numbers.foldRight(10) { item, current ->
//        println("current $current")
//        println("item $item")
//        println()
//        item + current
//    }
//
//    println("Fold result: $foldRigth")

    val number = listOf(1,2,3,4,5,6)
//    val drop = number.drop(3)
    val drop = number.dropLast(3)

    println(drop)

    val total = listOf(1, 2, 3, 4, 5, 6)
//    val take = total.take(3)
    val take = total.takeLast(3)


    println(take)

}

