fun main(args: Array<String>) {

    data class student11 (val name :String ,var grade :Int )


    class scool() {

        private var studentList1= mutableListOf<student11>()


        fun add (name: String, grade: Int){
            studentList1.add(student11(name,grade))

            //######???????

        }
        fun add(student11: student11){
            studentList1.add(student11)
        }
        fun remov (name: String){
            studentList1.removeIf{it.name.equals(name,ignoreCase =true)}

        }
        // :Int ?????????
        fun findStudentGradeByName(name: String):Int {
            var findstudent11=studentList1.find { it.name==name }
            return findstudent11?.grade?:0
        }

        //???????????????????????
        fun enhanceStudentGrades(){

            for (i in 0 until studentList1.size){
                if (studentList1[i].grade<5){
                    studentList1[i].grade+=1
                }
            }
        }
        fun printStudents(){
            println (studentList1)
        }
    }


    fun mian (args:Array<String>) {

        val scoole = scool()
        scoole.add("zamel", 1)
        scoole.add("rakan", 0)
        scoole.add("zyad", 4)
        var s1 = student11("xyz", 6)
        ///????????
        scoole.add(s1)
        scoole.printStudents()
        scoole.remov("zamel")
        scoole.printStudents()
        scoole.enhanceStudentGrades()
        scoole.printStudents()
        var grade = scoole.findStudentGradeByName("xyfz")
        println("grade is ${grade}")
}
}