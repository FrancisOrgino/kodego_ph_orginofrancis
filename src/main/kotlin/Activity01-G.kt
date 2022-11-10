fun main(){
    println("please enter your string")
    var word: String = readln()
    var word2 = word.reversed()
    if(word == word2) {
        println("your word $word is a palindrome")
    }
    else{
        println("your word $word is not a palindrome")
    }
}