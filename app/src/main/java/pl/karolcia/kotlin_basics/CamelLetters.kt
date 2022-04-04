package pl.karolcia.kotlin_basics

fun main () {

    val s = "the-Stealth_warrior"
    toCamelCase(s)


}//main


fun toCamelCase(slowo: String): String {

    var shift = 0
    val tablicaLiterek:CharArray = slowo.toCharArray()
    val size = tablicaLiterek.size

if (slowo==""){
    return ""
}

    for (l in 0 until size){



        if (tablicaLiterek[l].toByte().toInt() == 45 || tablicaLiterek[l].toByte().toInt() == 95) {

            shift++
            if (size-1>=l+1)
             {
                 if (tablicaLiterek[l+1].toByte().toInt() <91 && tablicaLiterek[l+1].toByte().toInt() >64)tablicaLiterek[l]=tablicaLiterek[l+1]
                    else tablicaLiterek[l]=tablicaLiterek[l+1]-32
            }

         for(j in l until size){
         if (size-1>=j+2)
             tablicaLiterek[j+1]=tablicaLiterek[j+2]
                             }
                                                                }}

for (z in size-shift until size){
    tablicaLiterek[z]=0.toChar()
}




    //Przepisanie do nowej tablicy
    val newTable = CharArray (size-shift)
    for (e in 0 until newTable.size)
    {
        newTable[e] = tablicaLiterek[e]
    }

    println(tablicaLiterek)
    println(newTable)
    return newTable.let { String(it) }
}