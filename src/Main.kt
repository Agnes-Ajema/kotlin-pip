fun main () {
    word("Akirachix")
    println(mySentence("Agnes", 23))
    println(getStringLength("Zinjanthropus"))
    myName("Ajema")
    myName("Agnes")
    myName("Agnes")
    myName("Ajema")
    name("fabulous")
    bat("anonymous")
    println(myStory("Alukwe", 16))
    println(getWordLength("love"))
    println(getTextLength("phineas"))
    println(myView("teacher", 3.58f))
    var a: Float = 2.565F
    println(a)
    var d = 20
    var n = 11.0
    println(d + n)
    println(d / n)



}
fun country(word:String) {
    var citizen = "kenyan"
    println(citizen)

}

fun word(text:String){
    println(text[0] + " " + text[2] + " " + text[3])
}
fun mySentence(name:String,age:Int):String{
    return ("hi my name is $name and i am $age years old")
}
fun getStringLength(word:String):Int{
   return (word.length)
}
fun myName(name1:String){
    if(name1 =="Agnes")
        println("that's me")
    else{
        println("i don't know who that is")
    }
}
fun myName(){
    var name = "Agnes"
    var x = "that's me!"
    var y = "i don't know who that is"
    if(name=="Agnes")
       println("that's me")
    else println("i don't know who that is")
}
fun name(text: String){
    println(text[0] )
    println(text[2])
    println(text[3])
}
fun bat(text: String){
    println(text[4]+ ""+text[5] +""+text[6] +""+text[7])
}
fun myStory(name:String,age:Int):String{
    return ("My name is $name and i am $age years old")
}
fun getWordLength(word: String):Int{
    return (word.length)
}
fun getTextLength(text: String):Int{
   return (text.length)
}
fun myView(word: String,mark:Float):String{
    return ("I am a $word and i got $mark in my test")
}
fun myFullName(){
   var fullName = "Agnes Ajema"
    var x = "that's me!"
   var y = "I don't know who that is!"
   if (fullName =="Agnes Ajema")
     println("that's me!")
       else println("I don't know who that is")
}
fun extract(mystring:String):String{
    return mystring.slice(0..5)
}

