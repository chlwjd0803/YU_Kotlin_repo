/*
* this code is YU Ex code.
 */

import MyKotlinClasses.Person
import MyKotlinClasses.Student
import MyKotlinClasses.Employee

fun main(args: Array<String>) {
    val st_nm = "Kim"
    val regID = 10000
    val stID = 20000
    val mjr = "ICT"
    var c1 = Student(st_nm, regID, stID, mjr)
    println("c1 = " + c1)
    println()
    var e1 = Employee("Choi", 12000, 7654, "Samsung", "MobileNetwork")
    println("e1 = " + e1)
}