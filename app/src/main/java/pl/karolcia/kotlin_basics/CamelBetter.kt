package pl.karolcia.kotlin_basics

fun main(){


    val word = "word_is_very-Important"
    CamelCase(word)

}//main




fun CamelCase ( str: String ) :String {
   // str.split('-', '_').mapIndexed { i, it -> if (i != 0) it.capitalize() else it }. joinToString("")
//print(str.split('-','_').mapIndexed(){ i, it -> if (i != 0) it.capitalize() else it })
var slowo = str.split('-','_').mapIndexed{i, it -> if ( i == 0 ) it else it.capitalize()}.joinToString("")

  // slowo = slowo.joinToString ("")
print(slowo)
    // slowo = slowo.joinToString { "" }



return str
}