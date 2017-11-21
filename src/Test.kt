/**
 * Created by gavin on 2017/11/21.
 */

class Test{


    var v="成员属性"

    fun setInterFace(test:TestInterFace){
        test.test()
    }
}

interface TestInterFace{
    fun test()
}

fun main(args: Array<String>) {

    var test=Test()

    test.setInterFace(object :TestInterFace{
        override fun test() {

            println("对象表达式")
        }

    })

}
