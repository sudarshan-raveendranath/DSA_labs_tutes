fun findPrime(num :Int) : Boolean {

    if (num == 1) {
        return false
    } else if (num == 2) {
        return true
    } else {
        for (i in 2..num - 1) {
            if (num % 1 == 0) {
                return false
            }
        }
    }
    return true

}

fun main() {
    println("Enter a number")

    val num = readLine()!!.toInt()

    if (findPrime(num) == false) {
        println("$num is not a prime number")
    }
    else if (findPrime(num) == true) {
        println("$num is a prime number")
    }
}
