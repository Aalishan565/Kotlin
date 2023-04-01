package _1_general

import kotlin.concurrent.thread

fun main() {
    var threadSample = ThreadSample()
    threadSample.startPrinting()
}

class ThreadSample {
    val number = 10
    private var counter = 1
    private lateinit var evenThread: Thread
    private lateinit var oddThread: Thread
    private val lock = Object()

    fun startPrinting() {
        oddThread = thread(name = "Odd Thread") { printOdd() }
        evenThread = thread(name = "Even Thread") { printEven() }
    }

    private fun printOdd() {
        synchronized(lock) {
            while (counter <= number) {
                println("$counter Current Thread is ${Thread.currentThread().name}")
                counter++
                lock.notify()
                if (counter % 2 == 0) {
                    try {
                        //println("wait(): " + Thread.currentThread().name);
                        lock.wait()
                    } catch (e: InterruptedException) {
                    }
                }
            }
        }
    }

    private fun printEven() {
        synchronized(lock) {
            while (counter <= number) {
                println("$counter Current Thread is ${Thread.currentThread().name}")
                counter++
                lock.notify()
                if (counter % 2 == 1) {
                    try {
                        //  println("wait(): " + Thread.currentThread().name);
                        lock.wait()
                    } catch (e: InterruptedException) {
                    }
                }
            }
        }
    }

}


