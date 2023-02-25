package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
//    val job = launch {
//        delay(1000L)
//        println("Start new job1!")
//    }
//
//    val job2 = Job(launch {
//        delay(1000L)
//        println("Start new job2!")
//    })

    val job3 = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job3!")
    }
//
//    job.start()
//    println("Other task")
//    job2.start()
//    println("Other task")

//    job3.start()
    job3.join()
    println("Other task")
}