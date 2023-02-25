package coroutines

import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new Job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("Time is up!"))
    println("cancelling job...")
    if (job.isCancelled) {
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}