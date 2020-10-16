package com.example.kotlintest

fun main() {
/*    val a = 10
    println("a = " + a)*/

  // print(getScore("s"));
  //  forTest()


    /*val p=Person()
    p.age=1
    p.name="tom"
    p.eat()*/

    var  s=Student("221",31 )

   s.name="student"
    s.age=12
    s.eat()
}

class Student (var sno:String,var grade:Int ): Person() {

    init {
        sno= sno+"init"
        grade= grade+1
    }
     override fun  eat(){
        print("name="+name+"--age="+age+"--sno="+sno+"--grade="+grade)
    }
}

open class Person {
    var  name=""
    var  age=0

    open fun  eat(){
        print("name="+name+"--age="+age)
    }
}

fun getScore(name: String) =  when(name){
    "s"->86
    else -> 89
}

fun  forTest(){
    val range=0..10
    /*for (i in range ){
        print(i)
    }*/
   /* for (i in 0 until 10){
        print(i)
    }*/
for (i in 0 until 10  step 3){
    print(i)
}




}