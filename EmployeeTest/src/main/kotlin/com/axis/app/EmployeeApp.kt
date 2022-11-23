package com.axis.app

import com.axis.services.EmployeeService
import com.axis.modal.Employee

fun main(){

    var employeeService=EmployeeService()
    //adding employee
    var employee=Employee(4,"Yamani",23000,"Nutrition",23)
    employeeService.addNewEmployee(employee)
    employeeService.viewAllEmployees()



}