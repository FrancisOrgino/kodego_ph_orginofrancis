fun main() {
    var borrowAndReturn = BorrowAndReturnBookFunction()
    var status: Boolean = true
    while (status) {
        println()
        println("Options")
        println("[1} List of Book")
        println("[2} Borrow")
        println("[3} Return")
        println("[4} Add books to library")
        println("[5} Exit")

        var options: Int = readln().toInt()

        if (options == 1) {
            borrowAndReturn.bookListInquiry()
        } else if (options == 2) {
            println("enter the book you want to borrow")
            var forBorrow: String = readln()
            borrowAndReturn.borrowBooksFunction(forBorrow)
        } else if (options == 3) {
            println("enter the book you want to return")
            var forReturn: String = readln()
            borrowAndReturn.returnBooksFunction(forReturn)
        } else if (options == 4) {
            println("enter the books you want to add")
            var newBooks: String = readln()
            borrowAndReturn.addBookstoLibraryFunction(newBooks)
        } else if (options == 5) {
            println("thank you")
            status = false
        }
    }
}
class BorrowAndReturnBookFunction(){
    var booklist = ArrayList<String>()
    init {
        println("welcome to the library")
        println("please choose from the options")
    }
    fun bookListInquiry(){
        println("available books are")
        for(newBooks in booklist)
            println(newBooks)
    }
    fun borrowBooksFunction(forBorrow:String){
        booklist.remove(forBorrow)
        println("thank you for borrowing $forBorrow")
    }
    fun returnBooksFunction(forReturn:String){
        booklist.add(forReturn)
        println("thank you for returning $forReturn")
    }
    fun addBookstoLibraryFunction(newBooks:String){
        booklist.add(newBooks)
        println("$newBooks is now added in the Library")
    }
}
