fun main() {
    var cad = "9 8 7 6\n"+
              "5 3 2 6\n"+
              "6 6 7 5\n "
    val Marray = ArrayList<ArrayList<Char>>()

    cad.forEach {
        if (it == '\n'){
            Marray.add(ArrayList())
        }
    }

    Marray.add(ArrayList())
    var contFil : Int = 0
    var contCol : Int = 0

    cad.forEach {
        if (!it.isWhitespace()){
            Marray[contFil].add(it)

            contCol++

        }
        if (it == '\n'){
            contCol=0
            contFil++
        }
    }


    contFil=0
    Marray.forEach{
        println(Marray[contFil])
        contFil++
    }

    impMatriz(Marray,contFil)
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