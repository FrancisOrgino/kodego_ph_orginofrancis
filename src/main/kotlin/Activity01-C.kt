
fun main(){


    // first input
    println("what are you adding to the inventory?")
    var response: String = readln().toString()

    // choosing options of items to recieve
    if (response == "Lucky me Beef")
        luckyBeef(input = String())
    if (response == "Lucky me Chicken")
        luckyChicken(input = String())
    if (response == "Lucky me Bulalo")
        luckyBulalo(input = String())


}
fun luckyBeef(input:String) {

    // asking of how many to recieve
    println("how many lucky me beef")
    var luckyMeBeef1: Int = readln().toInt()
    var amount2: Int = 0
    var stock1: Int = 100 // current stock


    do {
        println("are there other delivery receipt?")
        var response: String = readln().toString()

        // if there is more than 1 DR to add
        if (response == "yes") {
            println("how many in this Delivery receiptt")
            var amount2: Int = readln().toInt()
            luckyMeBeef1 = luckyMeBeef1 + amount2


            // if no will be end of line and print total recieved and current inventory
        }
        else if(response == "no"){

            println("the total you added is $luckyMeBeef1")
            stock1 = stock1 + luckyMeBeef1
            println("current inventory is $stock1")



        }
    } while (response == "yes")





}

fun luckyChicken(input:String){

    // asking of how many to recieve
    println("how many lucky me Chicken?")
    var luckyMeChicken1: Int = readln().toInt()
    var amount2: Int = 0
    var stock1: Int = 100 // current stock


    do {
        println("are there other delivery receipt?")
        var response: String = readln().toString()

        // if there is more than 1 DR to add

        if (response == "yes") {
            println("how many in this Delivery receipt")
            var amount2: Int = readln().toInt()
            luckyMeChicken1 = luckyMeChicken1 + amount2

            // if no will be end of line and print total recieved and current inventory

        }
        else if(response == "no"){
            println("the total you added is $luckyMeChicken1")
            stock1 = stock1 + luckyMeChicken1
            println("current inventory is $stock1")




        }
    } while (response == "yes")





}

fun luckyBulalo(input:String) {

    // asking of how many to recieve
    println("how many lucky me bulalo")
    var luckyMeBulalo1: Int = readln().toInt()
    var amount2: Int = 0
    var stock1: Int = 100 // current stock


    do {
        println("are there other delivery receipt?")
        var response: String = readln().toString()

        // if there is more than 1 DR to add

        if (response == "yes") {
            println("how many in this Delivery receipt")
            var amount2: Int = readln().toInt()
            luckyMeBulalo1 = luckyMeBulalo1 + amount2

            // if no will be end of line and print total recieved and current inventory

        }
        else if(response == "no"){
            println("the total you added is $luckyMeBulalo1")
            stock1 = stock1 + luckyMeBulalo1
            println("current inventory is $stock1")




        }
    } while (response == "yes")








}
