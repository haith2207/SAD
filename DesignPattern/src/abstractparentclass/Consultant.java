package abstractparentclass;

/**
 * Created by haith on 05/07/2016.
 */
public class Consultant extends Employee {

    public Consultant(String empName, String empID) {
        super(empName, empID);
    }

    @Override
    public String computeCompensation() {
        return ("Consultant is base + " +
                " allowance + OT - tax deductions");
    }
}
