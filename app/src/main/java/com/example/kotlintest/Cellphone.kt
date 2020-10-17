package com.example.kotlintest

fun main() {
    val s1 = singleObj
    val s2 = singleObj
    //print(s1.equals(s2))
    s2.listTest()
    // s2.mapTest()
    /* val  c=Cellphone("xiaomi","02415")
    val c2=Cellphone("xiaomi","02415")
        print(c==c2)*/
}

data class Cellphone(var name: String, var phonenumber: String)

object singleObj {
    fun test() {
        print("test")
    }

    fun listTest() {
        //  val list = listOf("ssa", "sds", 1)
        val list = mutableListOf("sa","ds","sasadddd")
        println(list.maxBy { it.length})

       /* for (l in list) {
            print(l)
        }*/
    }

    fun mapTest(){
        val  mapTest= mutableMapOf("wa" to 0,1 to 2)
      /* for (ent in mapTest){
            print(ent.key.toString()+"-"+ent.value)
        }*/

     /*   for ((f, n) in mapTest){
            print(f.toString()+"\t"+n.toString())
        }*/

     /*   for (entry in mapTest) {
     println(entry.key.toString() + "\t" + entry.value)
     }*/

    }


}