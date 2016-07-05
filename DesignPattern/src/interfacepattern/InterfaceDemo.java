package interfacepattern;

import com.sun.org.apache.xpath.internal.SourceTree;
import interfacepattern.model.Employee;
import interfacepattern.salary.SalaryCalculator;
import interfacepattern.salary.impl.CategoryA;
import interfacepattern.salary.impl.CategoryB;

/**
 * Created by haith on 28/06/2016.
 */
public class InterfaceDemo {

    public static void main(String[] args){
        /*****************************************************/
        System.out.println("******************************");
        SalaryCalculator c = new CategoryA(10000, 200);
        Employee employee = new Employee("Hai Tran", c);
        employee.display();
        System.out.println("******************************");
        c = new CategoryB(20000, 800);
        employee = new Employee("Van Ngo", c);
        employee.display();
        System.out.println("******************************");
        /*****************************************************/

    }
}
