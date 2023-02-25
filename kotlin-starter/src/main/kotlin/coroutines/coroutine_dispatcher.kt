package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {

//    val dispatcherDefault = launch(Dispatchers.Default){
//
//    }
//
//    val dispatcherIo = launch(Dispatchers.IO){
//
//    }

//    launch(Dispatchers.Unconfined) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()

//    val dispatcherSingleThread = newSingleThreadContext("myThread")
//    launch(dispatcherSingleThread) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }

    val dispatcherThreadPool = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcherThreadPool) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")

    }.start()

}