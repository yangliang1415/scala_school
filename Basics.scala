/*
Scala School First Class
Study Some Basics
*/

/*
class Calculator {
    val brand: String = "HP"
    def add(m: Int, n: Int): Int = m + n
}
*/

class Calculator(brand: String) {
    /**
     * A constructor
     */
     val color: String = if (brand == "TI") {
         "blue"
     } else if (brand == "HP") {
         "black"
     } else {
         "white"
     }
    
     // An instance mmethod
     def add(m:  Int, n: Int): Int = m + n
}

class ScientificCalculator(brand: String) extends Calculator(brand) {
    def log(m: Double, base: Double) = math.log(m) / math.log(base)
}

class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand) {
    def log(m: Int): Double = log(m, math.exp(1))
}


abstract class Shape {
    def getArea(): Int
}

class Circle(r: Int) extends Shape {
    def getArea():Int = { r * r * 3 }
}


trait Car {
    val brand: String
}

trait Shiny {
    val shineRefraction: Int
}

class BMW extends Car with Shiny {
    val brand = "BMW"
    val shineRefraction = 12
}


class C {
    var acc = 0
    def minc =  { acc += 1 }
    // val finc = { () => acc += 1 }
    val finc = { (acc: Int) => acc + 1 }
}
    

object Basics {
    def capitalizeAll(args: String*) = {
        args.map { arg =>
            arg.capitalize
        }
    }

    def main(args: Array[String]) {
        // test capitalizeAll
        println("test capitalizeAll Output")
        val res = capitalizeAll("my", "name", "is", "yangliang")
        res.foreach((a:String)=>print(a+' '))
        println()

        // test Calculator
        println("test Calculator Output")
        val calc = new Calculator("HP")
        println(calc.color)
        println(calc.add(1, 2))
        println()

        // test class C
        val c = new C
        println(c.acc)
        println(c.minc)
        println(c.acc)
        println(c.finc)
        println(c.finc(10))
        println(c.acc)

        // test ScientificCalculator
        val sciCal = new ScientificCalculator("TI")
        println(sciCal.color)
        println(sciCal.log(10, 2.73))

        // test EvenMoreScientificCalculator
        val evenSciCal = new EvenMoreScientificCalculator("O")
        println(evenSciCal.color)
        println(evenSciCal.log(3))

        // test abstract class
        val s = new Circle(2)
        println(s.getArea())

        // test trait
        val bmw = new BMW
        println(bmw.brand)
        println(bmw.shineRefraction)
    }
}
