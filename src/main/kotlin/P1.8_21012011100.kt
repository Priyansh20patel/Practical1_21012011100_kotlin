import java.util.*

fun main() {
    var a = arrayOf(10, 90, 60, 80, 100)
    //var arguments
    println(Arrays.deepToString(a))

    var b = IntArray(5)
    b[0]=2
    b[1]=3
    b[2]=5
    b[3]=7

    for (i in 0..b.size-1)
    {
        println(""+b[i])
    }

    var c = intArrayOf(1,3,4,5,6,7)


    for(i in 0..c.size-1)
    {
        println(""+c[i])
    }

    var arr = Array<Int>(5){i:Int->i}
    for(i in 0..arr.size-1){
        println(""+arr[i])
    }

}