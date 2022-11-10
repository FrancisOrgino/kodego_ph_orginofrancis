package exercises
fun main() {

    var books = mutableMapOf<String,Boolean>()
    books.put("Harry Potter",true)
    // first input
    println("Do you want to Borrow or return?")
    var response: String = readln().toString()

    // choosing options to return or borrow
    if (response == "borrow")
        borrowBook(input = String())
    if (response == "return")
        returnBook(input = String())


}

fun borrowBook(input:String) {

    //if borrowing a book, a message will ask of what book

    println("what book you want to borrow?")




    var toBorrow: String = readln().toString()

    var book1 = "Harry Potter"
    var book2 = "Hunger Games"
    var book3 = "The Witcher"

    var status1 = "Available"
    var status2 = "Not Available"

    // will show the availability of the book

    if(toBorrow == "Harry Potter")
        println("The book $book1 is $status1")

    if(toBorrow == "Hunger Games")
        println("The book $book2 is $status1")

    if(toBorrow == "The Witcher")
        println("The book $book3 is $status1")








}

fun returnBook(input:String){

    //if returning a book a message will ask what book is to be returned

    println("what book you want to return?")

    var toReturn: String = readln().toString()

    if(toReturn == "Harry Potter")
        println("you returned Harry Potter")

    if(toReturn == "Hunger Games")
        println("you returned Hunger Games")

    if(toReturn == "The Witcher")
        println("you returned The Witcher")





}