/*
Scala School First Class
Study Some Basic
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

class C {
    var acc = 0
    def minc =  { acc += 1 }
    // val finc = { () => acc += 1 }
    val finc = { (acc: Int) => acc + 1 }
}
    

object basics {
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
    }
}




