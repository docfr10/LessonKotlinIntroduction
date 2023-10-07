fun main(args: Array<String>) {
    val double: Double
    val float: Float = 1.0F
    val long: Long = 10L
    val int: Int = 1
    val short: Short
    val byte: Byte = 0x000F

    var double1: Double = 1.0
    var float1: Float = 1.0F
    var long1: Long
    var int1 = 12
    var short1: Short
    var byte1: Byte = 0b0000

    float1 = 3.0F
    float1 = 13.0F
    float1 = 4.0F
    float1 = 10.0F

    val char: Char = 'c'

    val boolean = true
    val boolean1 = false

    if (int1 > int) {
        println("int1 > int")
        println("fdsfd")
        println("fdsfd")
        println("fdsfd")
        println("fdsfd")
    } else println("else")

    val max = if (int1 > int) int1 else int

    when (int1) {
        12 -> println("12")
        11 -> println("11")
        12, 13, 14 -> println("12||13||14")
        in 10..15 -> println("asfdasd")
        else -> println("else")
    }

    while (int1 > 0) {
        int1--
        println(int1)
    }

    do {
        int1--
        println(int1)
    } while (int1 > 0)

    var string: String = "Hello world"

    for (i in string) {
        println(i)
    }

    val string1 = """
        fasfda
        fas
        fa
        sff
        f f
        fas
                s d
               
        """

    val str = "int1 = ${int1}"

    val array: Array<String> = arrayOf("fadsadas", "sadad", "asddsa")
    val intArray: IntArray = IntArray(5, { 1 })
    array[0] = "Hello"

    val a = Array(5, { IntArray(5, { 1 }) })

    example(x = 1, y = 2)

    var j: Int? = 1
    j = null

    var str1: String? = "SDdsaffsa"
    str1 = null

    val r: String = str1!!

}

fun example(x: Int, y: Int, i: Int = 1): Int = x + y + i
