/**
 * Created by gavin on 2017/11/20.
 */


fun main(args: Array<String>) {


    // whendemo()

    //var user = UserBean("LvPeng", "Beijing")

   // println(user.city)
   // println(user.name)

   // val demo = Outer.Nested().foo()

   // println(demo)

    var demo= Outer().Inner()

    var test=demo.innerTest()

    println(demo)
    println(test)
}


fun whendemo(): Unit {

    var x: Int = 101

    when (x) {

        100 -> print("x==1")
        200 -> print("x==2")
        else -> {

            print("不是1 也不是2")
        }
    }


}


fun arr(): Unit {
    //val a= arrayOf(1,2,3,4)

    val b = Array(3, { i -> (i * 2) })

    println(b[2])
}


fun sum(): Unit {
    for (i in 1..9) {

        println(i)
        print("   ")
    }


}

fun sum(a: Int, b: Int): Int {

    return a + b
}

fun vars(vararg v: Int) {
    for (vt in v) {

        print(vt)
    }
}

fun getStringLenth(obj: Any): Int? {
    if (obj is String) {

        return obj.length
    }


    return null
}


