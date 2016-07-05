package abstractparentclass;

/**
 * Created by haith on 05/07/2016.
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Employee emp = new Consultant("Hai Tran", "haith");
        emp.save();
        System.out.println(emp.computeCompensation());

        emp = new SalaryRep("Hoang Hai", "haith1");
        emp.save();
        System.out.println(emp.computeCompensation());
    }
}
