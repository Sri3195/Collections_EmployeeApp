package com.axis.services
import com.axis.database.EmployeeDatabase
import com.axis.modal.Employee
class EmployeeService {

    var employeedatabase=EmployeeDatabase()

    fun viewAllEmployees()
    {
        var employees=employeedatabase.employeeData()
        for(employee in employees){
            println("${employee.id} | ${employee.name} | ${employee.salary} |${employee.dept} | ${employee.age}")

        }
    }

    fun addNewEmployee(employee:Employee):String{
        employeedatabase.employeeData().add(employee)
        return "successfully added"
    }
}