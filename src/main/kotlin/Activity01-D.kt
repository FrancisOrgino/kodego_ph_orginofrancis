fun main () {

    // first function entering amount


    println("Enter Amount you want to Deposit")
    var amount1: Int = readln().toInt()
    println("Enter the second amount you want to deposit")
    var amount2: Int = readln().toInt()
    println("Enter the third amount you want to deposit")
    var amount3: Int = readln().toInt()
    println("Enter the fourth amount you want to deposit")
    var amount4: Int = readln().toInt()
    println("Enter the fifth amount you want to deposit")
    var amount5: Int = readln().toInt()
    println("divide by how many?")
    var divisor: Int = readln().toInt()

    var totalAmount = amount1 +amount2 +amount3 +amount4 +amount5
    var dividedAmount = totalAmount/divisor

    println("total amount is $dividedAmount")



    }