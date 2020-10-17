package com.example.kotlintest
fun main(){
  val s1=singleObj
    val s2=singleObj
    print(s1.equals(s2))
    /* val  c=Cellphone("xiaomi","02415")
    val c2=Cellphone("xiaomi","02415")
        print(c==c2)*/
}
data class Cellphone(var name:String,var  phonenumber:String)

object singleObj {
fun test(){
    print("test")
}
}