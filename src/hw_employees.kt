//class
class Employees(var empNum: Int,
                   var empName: String?,
                   var empShift: Int){
// displays the class
    fun printAll(){
        println("\nEmployee Number: " + empNum.toString() + "\nEmployee Name: " + empName +
                "\nEmployee Shift: " + empShift)
        //println("${contactID.toString()} \n $firstName $lastName")
    }
}