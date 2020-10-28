fun main() {

    val f1 = Fraction()
    f1.numerator = 1F
    f1.denuminator = 2F

    val f2 = Fraction()
    f2.numerator = 1F
    f2.denuminator = 3F

    val f3 = f1.mimateba(f2)
    println(f3.numerator)
    println(f3.denuminator)

}

         class Fraction {

         var numerator: Float = 2F
         var denuminator: Float = 3F

         fun mimateba(fraction: Fraction) : Fraction {

             val d = denuminator*fraction.denuminator
             val n1 = d/denuminator*numerator
             val n2 = d/fraction.denuminator*fraction.numerator
             val m = Fraction()
             m.numerator = n1+n2
             m.denuminator = d
             return m
         }
     }

fun main2() {

    val q1 = Fraction()
    q1.numerator = 2F
    q1.denuminator = 3F

    val q2 = Fraction()
    q2.numerator = 3F
    q2.denuminator = 4F

    val q3 = q1.numerator*q2.numerator/q1.denuminator*q2.denuminator
    println(q3)


        class Fraction2 {

        var numerator: Float = 2F
        var denuminator: Float = 3F
        fun gamravleba(fraction: Fraction) : Fraction {

            val w = numerator*fraction.numerator
            val v1 = denuminator*fraction.denuminator
            val v2 = w/fraction.denuminator*fraction.numerator
            val y = Fraction()
            y.numerator = w
            y.denuminator = v1
            return y
        }
    }


}



fun main3() {

    val t1 = Fraction()
    t1.numerator = 9F
    t1.denuminator = 27F

    val t2 = t1.numerator/9
    val t3 = t1.denuminator/9
    println(t2)
    println(t3)
}



