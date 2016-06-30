package example.model;

import example.salary.SalaryCalculator;

/**
 * Created by haith on 28/06/2016.
 */
public class Employee {
    private SalaryCalculator _empType;
    private String _name;

    public Employee(String name, SalaryCalculator empType){
        _name = name;
        _empType = empType;
    }

    public void display(){
        System.out.println("Name: "+ _name);
        System.out.println("Salary: "+ _empType.getSalary());
    }

}
