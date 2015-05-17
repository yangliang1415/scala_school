class Foo {}

object FooMaker {
    def apply() = new Foo
}

class Bar {
    def apply() = 0
}

object Timer {
    var count = 0
    
    def currentCount(): Long = {
        count += 1
        count
    }
}


// change addOneT to  addOneT, error, why?
object addOneT extends Function1[Int, Int] {
    def apply(m: Int): Int = m + 1
}


class AddOne extends Function1[Int, Int] {
    def apply(m: Int): Int = m + 1
}

case class Calculator(brand: String, model: String)


object BasicsTwo {
    def bigger(o: Any): Any = {
        o match {
            case i: Int if i < 0 => i - 1
            case i: Int => i + 1
            case d: Double if d < 0.0 => d - 0.1
            case d: Double => d + 0.1
            case text: String => text + "s"
        }
    }

    def main(args: Array[String]) {
        val newFoo = FooMaker()
        println(newFoo)

        val bar = new Bar
        println(bar())

        val res1 = Timer.currentCount()
        println(res1)

        println(addOneT(1))

        val plusOne = new AddOne()
        println(plusOne(1))

        val times = 1
        val res2 = times match {
            case 1 => "one"
            case 2 => "two"
            case _ => "some other number"
        }
        println(res2)

        println(bigger(-1))
        println(bigger(100.01))
        println(bigger("hehe"))

        val hp20b = Calculator("hp", "20b")
        val hp20B = Calculator("hp", "20b")
        println(hp20b)
        println(hp20B)
        println(hp20b==hp20B)
        val foo1 = new Foo
        val foo2 = new Foo
        println(foo1)
        println(foo2)
        println(foo1==foo2)
    }
}




