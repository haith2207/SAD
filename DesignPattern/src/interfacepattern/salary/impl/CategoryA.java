package interfacepattern.salary.impl;

import interfacepattern.salary.SalaryCalculator;

/**
 * Created by haith on 28/06/2016.
 */
public class CategoryA implements SalaryCalculator {
    private double _baseSalary;
    private double _overTime;

    public CategoryA(double baseSalary, double overTime){
        _baseSalary = baseSalary;
        _overTime = overTime;
    }

    @Override
    public double getSalary(){
        return (_baseSalary + _overTime);
    }
}
