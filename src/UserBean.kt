/**
 * Created by gavin on 2017/11/20.
 */
class UserBean( name:String) {

    init {

        println("init方法")
    }


    constructor(name:String,city:String):this(name){


        println("构造方法")


        this.city=city
    }




    var city:String="北京"
    var name:String="吕鹏"




    fun foo() {

        println("Foo")
    }
}