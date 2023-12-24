fun findGrade(marks : Int) : Char {

    if (marks <= 100 && marks >= 75) {
        return 'A'
    }
    else if (marks <= 74 && marks >= 65) {
        return 'B'
    }
    else if (marks <= 64 && marks >= 50) {
        return 'C'
    }
    else if (marks <= 49 && marks >= 35) {
        return 'D'
    }
    else {
        return 'F'
    }

}

fun main() {
    println("enter your marks-")
    
    var marks = readLine()!!.toInt()
    println("your grade is ${findGrade(marks)}")
}
