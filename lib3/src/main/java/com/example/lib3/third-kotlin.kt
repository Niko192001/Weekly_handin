package com.example.lib3
/*
fun main() {
    print("asd")
}
 */

/* Opgave 1
// A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
// Let the user input their age. Get inspiration in the terminal output below:
fun main() {
    print("Enter your age:")
    val ageInput = readLine()!!
    val age = ageInput.toInt()
    if(age != null)
    println("You wrote $age")

    fun isEligibleToVote(age: Int): Boolean {
        return age >= 18
    }
    if (isEligibleToVote(age)) {
        println("You are eligible to vote.")
    } else {
        println("You are NOT eligible to vote.")
    }
}
 */

/* Opgave 2
Define two functions to print the maximum and the minimum number respectively among three numbers

fun main() {
    val N1 = 1
    val N2 = 18
    val N3 = 8

    if (N1 >= N2 && N1 >= N3)
        println("$N1 is the largest Number")
    else if (N2 >= N1 && N2 >= N3)
        println("$N2 is the largest number")
    else
        println("$N3 is the largest number")

    if (N1 <= N2 && N1 <= N3)
        println("$N1 is the lowest number")
    else if (N2 <= N1 && N2 <= N3)
        println("$N2 is the lowest number")
    else
        ("$N3 is the lowest number")

}
 */

/* Opgave 3
Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.
fun main() {

    val avg = calculateAverage(listOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0))
    println(avg)
}

fun calculateAverage(numbers: List<Double>): Double {
    if (numbers.isEmpty()) return 0.0
    return numbers.sum() / numbers.size
}
 */

/* Opgave 4
Write a method that returns if a user has input a valid CPR number.
A valid CPR number has:
10 Digits.
The first 2 digits are not above 31.
The middle 2 digits are not above 12.
The method returns true if the CPR number is valid, false if it is not.

fun main() {

    println("1203015999: ${isValidCprNumber("1203015999")}")
    println("4010056999: ${isValidCprNumber("4010056999")}")
}

class CprValidator
fun isValidCprNumber(cpr: String): Boolean {
    //Check for 10 tal og ikke andre tegn
    if (cpr.length != 10 || !cpr.all { it.isDigit() }) { // sikre at alle tegn er tal
        return false
    }
    // step 2, tag de første cifre som dage og de næste to som måned
    val dayStr = cpr.substring(0, 2)
    val monthStr = cpr.substring(2, 4)
    val yearStr = cpr.substring(4, 6)

    //step 3 gør alle tal til heltal
    val day = dayStr.toInt() //laver om til heltal
    val month = monthStr.toInt() //laver om til heltal
    val year = yearStr.toInt()//laver om til heltal

    if (day > 31 || month > 12) {
        return false
    }
    return true

}
 */

/*Opgave 5
//Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
//For numbers which are multiples of both three and five print “FizzBuzz”.

fun main(){

    for (i in 1..100){
        when{
            i % 15 == 0-> println("FizzBuzz")
            i % 3 == 0-> println("Fizz")
            i % 5 == 0-> println("Buzz")
            else -> println(i)
        }
    }
}
 */

/* Opgave 6
//Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is.
//For example, if your name is Robert Brett Roser, then the output should be R.B. Roser. Or Benjamin Dalsgaard Hughes will be B.D. Hughes
fun main() {
    println("Enter your full name:")
    val inputName = readLine() ?:""

    val abbreviated = abbreviateName(inputName)
    println("Abbreviated name:${abbreviated}")

    println("Nikolaj Birkelund Rahe -> ${abbreviateName("Nikolaj Birkelund Rahe")}")
}

fun abbreviateName(fullName: String): String {
    val parts = fullName.trim().split("\\s+".toRegex())
    if (parts.size < 2) {
        return fullName // returne fulde navn hvis der ikke er nok navne til forkortelser
    }

    val firstNameInitial = parts[0].first().uppercaseChar()
    val lastName = parts.last() //Den sidste del er mellemnavnent

    //Bygger den forkorte streng
    val initialPart = StringBuilder()

    // Tilføjer første for bogstav
    initialPart.append(firstNameInitial).append(".")

    // tilføjer mellemnavnet, hvis der er et
    for (i in 1 until parts.size - 1) {
        initialPart.append(parts[i].first().uppercaseChar()).append(".")
    }
    initialPart.append(lastName)

    return initialPart.toString()
}
 */

/* Opgave 7
// Write a program that takes a numerical grade (0-100) as input and prints out the corresponding american letter grade.
// Implement a function calculateGrade that takes an integer parameter representing the grade and returns a string representing the letter grade according to the following scale:

fun main() {
    println("Skriv en karakter mellem 0 og 100:")

    val input = readLine() ?: ""
    val grade = input.toInt()

    val letter = calculateGrade(grade)

    println("Din amerikanske karakter er ${letter}")
}

fun calculateGrade(grade: Int): String {
    return when {
        grade >= 90 -> "A"
        grade >= 80 -> "B"
        grade >= 70 -> "C"
        grade >= 60 -> "D"
        else -> "F"
    }

}
 */

/* Opgave 8

//Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum length, and returns a list containing only the words that have a length greater than or equal to the specified minimum length.
//Use filter function and lambda expressions

fun main() {
    val allWords = listOf("apple", "banana", "strawberry", "grapefruit", "fig","pear","pineapple","blueberry")
    val minLength = 5

    val longWords = filterWordsByLength(allWords, minLength)

    println("Words longer than or equal to $minLength charactars $longWords") //
}

fun filterWordsByLength(words: List<String>, minLength: Int): List<String> {
    return words.filter { it.length >= minLength } // lambda funktionen der refere til hvert ord
}
 */
