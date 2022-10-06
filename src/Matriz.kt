fun main() {
    var cad = "9 8 7 6\n "+
              "5 3 2 6\n "+
              "6 6 7 5\n"
    val Marray = ArrayList<ArrayList<Char>>()
    var cont = 0
    cad.forEach {
        if (it == '\n'){
            println(cont)
            Marray.add(ArrayList())
            cont++
        }

    }

    var contFil : Int = 0
    var contCol : Int = 0
    var contCol2 : Int = 0
    println("----------------------")
    cad.forEach {
        if (!it.isWhitespace()){

            println(contCol)
            Marray[contFil].add(it)
            contCol++

        }
        contCol2=contCol
        if (it == '\n'){
            contCol=0
            contFil++
        }
    }
    println("----------------------")
    println(contCol)

    //println(contFil)
    //println(contCol)


    impMatriz(Marray,contCol2)
}
fun impMatriz(Marray:ArrayList<ArrayList<Char>>, contCol: Int){
    print("   ")
    repeat(contCol){
        print(" ${it+1} ")
    }
    println()
    print("  |")
    repeat(contCol*3){
        print("-")
    }
    println()
    repeat(Marray.size){
        print("${it+1} |")
        val i=it
        repeat(contCol){
            print(" ${Marray[i][it]} ")
        }
        println()
    }
}