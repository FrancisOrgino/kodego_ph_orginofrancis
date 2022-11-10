fun main() {
    var studentInquiry = StudentInquiryFunction()
    var status: Boolean = true
    while(status) {
        println()
        println("Options")
        println("[1] list of students")
        println("[2] add students")
        println("[3] encode grades")
        println("[4] encode attendance")
        println("[0] Exit")
        var options: Int = readln().toInt()


        if (options == 1) {
            studentInquiry.listOfStudents()
        } else if (options == 2) {
            println("enter student name")
            var newStudent: String = readln()
            studentInquiry.addNewStudent(newStudent)
        } else if (options == 3) {
            println("please enter student name")
            var studentName: String = readln()
            if (studentName in studentInquiry.studentList)
                println("please enter student grade")
            var encodedGrade: Int = readln().toInt()

        } else if (options == 4) {
            var encodeAttendance = studentInquiry.addStudentAttendance()
            encodeAttendance
        } else if (options == 0) {
            println("thank you")
            status = false
        }
    }

}

class StudentInquiryFunction(){
    var studentList = mutableListOf<String>()
    var grade = mapOf<String,Int>()
    var attendance = mapOf<String,Int>()


    init {
        println("welcome to student inquiry")
    }

    fun listOfStudents() {
        println("these are the list of students")
        for (student in studentList){
            println(student)
        }
    }

    fun addNewStudent(student: String) {
        studentList.add(student)
        println("$student is now added on the list")
    }
    fun encodeStudentGrade(studentName: String, encodeGrade:Int,){

    }

    fun addStudentAttendance() {
        println("please enter student name")
        var studentName: String = readln().toString()
        println("please enter student attendance")
        var addAttendance: Int = readln().toInt()

    }

}