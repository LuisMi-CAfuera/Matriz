fun main() {
    var cad = "9 8 7\n"+
              "5 3 2\n"+
              "6 6 7\n "
    val Marray = ArrayList<ArrayList<Char>>()
    var contCol : Int = 0

    cad.forEach {
        if (it == '\n'){
            Marray.add(ArrayList())
        }
    }

    var contFil : Int = 0

    cad.forEach {
        if (!it.isWhitespace()){
            Marray[contCol].add(it)
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
}
