package com.axis.database
import com.axis.modal.Employee
class EmployeeDatabase {
    var employeelist= mutableListOf<Employee>()
    init{
        employeelist.add(Employee(1,"Sri",25000,"CSE",21))
        employeelist.add(Employee(2,"lakshmi",30000,"CSE",22))
        employeelist.add(Employee(3,"Bala",35000,"CHEM",22))

    }

    fun employeeData():MutableList<Employee>{
        //employeelist.add(Employee(1,"Sri",25000,"CSE",21))
        return employeelist
    }
}