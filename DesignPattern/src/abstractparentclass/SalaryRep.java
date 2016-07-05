package abstractparentclass;

/**
 * Created by haith on 05/07/2016.
 */
public class SalaryRep extends Employee {
    public SalaryRep(String empName, String empID) {
        super(empName, empID);
    }

    @Override
    public String computeCompensation() {
        return ("Sales Rep Salary is Base + commission + " +
                "allowance - tax deductions");
    }
}
