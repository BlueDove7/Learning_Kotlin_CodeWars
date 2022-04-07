package pl.karolcia.kotlin_basics

fun main(){

    var s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"
    var r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw"
    print("Slowowejsciowe:")
    println (s)

    vertMirror(s)

    horMirror(r)

}//main

fun horMirror(word2: String):(String) {
    var  splitowane = mutableListOf<String>()
    splitowane = word2.split('\n').toMutableList()
    val size2 = splitowane.size
    var splitowaneNew = mutableListOf<String>()

    for (i in 0 until size2/2){

        splitowaneNew[i] = splitowane[size2-1-i]
    }

    print("Slowo Hor:")
    print (splitowane.toString())
    return splitowane.toString()
}



fun vertMirror (word: String):(String){
    var  splitowane = mutableListOf<String>()
    splitowane = word.split('\n').toMutableList()

    val size = splitowane.size

    for (i in 0 until size){
    splitowane[i] = splitowane[i].reversed()
    }

    print("Slowo Ver:")
    print (splitowane.toString())
    return splitowane.toString()
}

