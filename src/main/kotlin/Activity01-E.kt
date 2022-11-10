package exercises

fun main() {

    var uniqueString1 : String = ""
    var uniqueString2 : String = ""
    var countDuplicate : Int = 0
    var stringCount1 : Int = 0
    var stringCount2 : Int = 0


    println("Enter 1st String: ")
    var string1 = readln()
    println("Enter 2nd String: ")
    var string2 = readln()
    var stringLength1 = string1.length
    var stringLength2 = string2.length


    var ctr1 : Int = 0
    while(ctr1 < stringCount1) {
        var ctr2 : Int = 0
        countDuplicate = 0
        while ((ctr2 < stringCount2) && (countDuplicate == 0)) {

            if(string1[ctr1] == string2[ctr2]) {
                countDuplicate++
            }
            ctr2++
        }
        if(countDuplicate == 0) {
            if(!uniqueString1.contains(string1[ctr1])) {
                uniqueString1 += string1[ctr1]
            }
        }
        ctr1++
    }


    var ctr2 : Int = 0
    while(ctr2 < stringCount2) {
        var ctr1 : Int = 0
        countDuplicate = 0
        while ((ctr1 < stringCount1) && (countDuplicate == 0)) {

            if(string2[ctr2] == string1[ctr1]) {
                countDuplicate++
            }
            ctr1++
        }
        if(countDuplicate == 0) {
            if(!uniqueString2.contains(string2[ctr2])) {
                uniqueString2 += string2[ctr2]
            }
        }
        ctr2++
    }

        var uniqueChar = mutableListOf<String>()
        uniqueChar.add(uniqueString1)
        uniqueChar.add(uniqueString2)
    println("Unique characters are $uniqueChar")







}