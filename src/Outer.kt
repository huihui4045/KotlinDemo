/**
 * Created by gavin on 2017/11/21.
 */

class Outer{

    private val bar:Int=1

    var v="成员属性"

    class Nested{
        fun foo()=2
    }

    inner class Inner{

        fun foo()=bar

        fun innerTest(){

            var o=this@Outer

            println(""+o.v)
        }

    }
}
