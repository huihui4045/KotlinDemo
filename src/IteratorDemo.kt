/**
 * Created by gavin on 2017/11/20.
 */

fun main(args: Array<String>) {

    //fordemo()

}


fun foo(){

    var datas= listOf(1,2,3,4)

    datas.forEach litem@{
        if (it==2) return@litem

        print(it)
    }

    println("foo")
}



fun fordemo(){

    val a = arrayOf(1, 2, 3)
    for (i in a.indices){
        println(a[i])
    }
    val items= listOf("apple","banana","kiwi")

    for (item in items) {

        println(item)
    }
    for (index in items.indices){

        print("item at $index is ${items[index]}\n")
    }
    items.forEach(fun(value:String){

        println(value)
    })


    println("======================")






}

