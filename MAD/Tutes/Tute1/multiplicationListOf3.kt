fun main() {
    val multiplicationListOf3 = mutableListOf<Int>()
    for(i in 0..100 step 3) {

        multiplicationListOf3.add(i)
    }
    
    println("original list= $multiplicationListOf3")

    for(i in multiplicationListOf3.indices) {
        if(i % 2 == 0) {
            multiplicationListOf3[i] = 999
        }
    }

    println("replaced list= $multiplicationListOf3")
}



