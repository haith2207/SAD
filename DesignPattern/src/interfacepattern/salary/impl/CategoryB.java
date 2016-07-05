package interfacepattern.salary.impl;

import interfacepattern.salary.SalaryCalculator;

/**
 * Created by haith on 28/06/2016.
 */
public class CategoryB implements SalaryCalculator {
    private double _salesAmt;
    private double _baseSalary;
    final static double _commission = 0.02;

    public CategoryB(double salesAmt, double baseSalary){
        _salesAmt = salesAmt;
        _baseSalary = baseSalary;
    }

    @Override
    public double getSalary(){
        return _baseSalary + (_salesAmt * _commission);
    }
}
