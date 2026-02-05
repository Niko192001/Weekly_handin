package com.example.lib4
import jdk.jfr.Percentage

/* Opgave 1
//Create a class called Employee that includes three pieces of information as instance variables
//A first name
//A last name
//A monthly salary
//Your class should have a constructor that initializes the three instance variables.
//If the monthly salary is not positive, set it to 0.0.
//Create two Employee objects and display each object’s yearly salary.
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */
/*
class Employee(
    var firstName: String,
    var lastName: String,
    monthlySalary: Double
) {
    //Månedsløn med validering i init‑blokken
    var monthlySalary: Double = if (monthlySalary > 0) monthlySalary else 0.0
        private set // Gøre setter private til at kun tillade ændringer via metoden hvis det nødvendigt

    //Laver årlig løn
    fun getYearlySalary(): Double {
        return monthlySalary * 12
    }

    fun giveRaise(percentage: Double) {
        if (percentage > 0) {
            monthlySalary *= (1 + percentage / 100)
        }
    }

    //Overrider vi til streng for at nemt printe medarbejder detajler
    override fun toString(): String {
        return "Employee(Name: $firstName $lastName, Monthly Salary: $monthlySalary, Yearly salary ${getYearlySalary()})"

    }
}
fun main() {
    //Laver 2 medarbejder
    val emp1 = Employee(
        "Anna",
        "Hansen",
        5000.0)
    val emp2 = Employee(
        "Per",
        "Jørgensen",
        -1000.0
   )//Negative løn, der gerne skulle være 0.0, da jeg har lavet en setter, hvor grænsen er 0.0

    println("-----Initial salaries ------")
    println(emp1)
    println(emp2)

    emp1.giveRaise(10.0)
    emp2.giveRaise(10.0)


    println("\n----Salaries after 10% Raise-----")
    println(emp1)
    println(emp2)
}
 */


/* Opgave 2
//Create a new class called Computer. Before you add any more code, know that you will need to add two additional classes: Laptop and SmartPhone
//For a parent class add 3 properties, 2 methods, and a constructor.
//For a child class add at least 1 additional property and 1 additional method.
//In the main method create a Laptop and a SmartPhone
 */
/*
// Parent class
open class Computer(val brand: String, val processor: String, var isPoweredON: Boolean = false) {

    init {
        println("Initialiser ny enhed fra $brand...")
    }

    fun powerToggle() {
        isPoweredON = !isPoweredON
        val status = if (isPoweredON) "tændt" else "slukket"
        println("$brand endheden er nu $status.")
    }

    open fun displaySpecs() {
        println("Specifikationer: Brand: $brand, CPU: $processor")
    }
}

//child class
class Laptop(brand: String, processor: String, val BatteryLife: Int) : Computer(brand, processor) {

    fun openLid() {
        println("Låget på din $brand laptop er nu åbent")
    }

    override fun displaySpecs() {
        super.displaySpecs()
        println("Batteri tid: $BatteryLife timer ")
    }
}

//Child class 2
class SmartPhone(brand: String, processor: String, val ScreenInches: Double): Computer(brand,processor){

    fun makeCall(number: String){
        println("Ringer op til $number fra din $brand telefon")
    }

    override fun displaySpecs() {
        super.displaySpecs()
        println("Skærmstørrelse: $ScreenInches tommer")
    }
}

fun main(){
    //Opretter en laptop
    val myLaptop = Laptop("Apple", "M3 Max", 18)
    myLaptop.powerToggle()
    myLaptop.openLid()
    myLaptop.displaySpecs()

    println("----")

    //Opretter en smartphone
    val myPhone = SmartPhone("Samsung","Snapdragon Gen 3",6.8)
    myPhone.powerToggle()
    myPhone.makeCall("12345678")
    myPhone.displaySpecs()
}

 */



/* Opgave 3
//Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory. Subclass it to create specific product types like Shoe, T-shirt, and Book. Override the function such that:
//The shoe outputs "I am a shoe" .
//The T-shirt outputs "I am a T-shirt"
//The book outputs "I am a book"
 */
/*
//base/parent class
open class Product(val name: String, val price: Double, val quantity: Int){
    open fun identifyProductCategory(){
        println("Jeg er et generisk produkt")
    }
}
//Child class
class Shoe(name:String, price:Double,quantity: Int): Product(name,price,quantity){
    override fun identifyProductCategory() {
       println("I am a shoe")
    }
}
//Child class
class TShirt(name:String,price:Double,quantity: Int): Product(name,price,quantity){
    override fun identifyProductCategory() {
        println("I am a T-shirt")
    }
}
//Child class
class Book(name:String,price:Double,quantity: Int): Product(name,price,quantity){
    override fun identifyProductCategory() {
        println("I am a book")
    }
}

fun main(){
    val items = listOf(
        Shoe("Nike",950.0,5),
        TShirt("Ralph Lauren",500.0,4),
        Book("Shakespire",350.0,10)
    )
    items.forEach { it.identifyProductCategory() }
}
 */


/* Opgave 4
//Get an LLM (ChatGPT, Deepseek, etc) to solve the following exercise two times. One as a junior developer, one as a senior developer.
//Describe the differences in the the two solutions. What solution do you prefer? Are there concepts you dont understand. If so learn them and explain them.

//Create 2 classes Circle & Triangle with a parent class: Shape.
//Every shape has two attributes

//color
//isTransparent
//Furthermore every class has private attributes to calculate perimeter and area for each shape.
//E.g. a Rectangle has the attributes: height, width, color & isTransparent

//The attributes are set in the constructor
//The 2 classes all overrides the following abstract methods from their parent class:

//calculatePermeter
//calculateArea
//The functions will return the perm eter or area of the shape.
*/
/* Junior delen ⬇️

abstract class Shape(
    val color: String,
    val isTransparent: Boolean
){
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}
class Cirle(
    val radius: Double,
    color: String,
    isTransparent: Boolean
): Shape(color, isTransparent){
    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}
class Triangle(
    val a: Double,
    val b: Double,
    val c: Double,
    color: String,
    isTransparent: Boolean
): Shape(color,isTransparent){
    override fun calculatePerimeter(): Double {
        return a + b + c
    }

    override fun calculateArea(): Double {
        val s = calculatePerimeter()/2
        return Math.sqrt(s*(s-a)*(s-b)*(s-c))
    }
}
fun main(){
    val circle = Cirle(5.0,"red",false)
    val triangle = Triangle(3.0,4.0,5.0,"blue", true)

    println(circle.calculateArea())
    println(triangle.calculatePerimeter())
}
 */

/* Senior delen⬇️
abstract class Shape(
    val color: String,
    val isTransparent: Boolean
) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Circle(
    radius: Double,
    color: String,
    isTransparent: Boolean,
) : Shape(color, isTransparent) {
    private val radius: Double = radius.coerceAtLeast(0.0)

    override fun calculatePerimeter(): Double =
        2 * Math.PI * radius

    override fun calculateArea(): Double =
        Math.PI * radius * radius
}

class Triangle(
    sideA: Double,
    sideB: Double,
    sideC: Double,
    color: String,
    isTransparent: Boolean,
) : Shape(color, isTransparent) {

    private val a = sideA.coerceAtLeast(0.0)
    private val b = sideB.coerceAtLeast(0.0)
    private val c = sideC.coerceAtLeast(0.0)

    init {
        require(a + b > c && a + c > b && b + c > a) {
            "Invalid triangle side lengths"
        }
    }

    override fun calculatePerimeter(): Double = a + b + c

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }
}
fun main(){
    val circle = Circle(5.0,"red",false)
    val triangle = Triangle(3.0,4.0,5.0,"blue", true)

    println("Circle area: ${circle.calculateArea()}")
    println("Triangle area: ${triangle.calculatePerimeter()}")

 */