package abstractparentclass;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by haith on 05/07/2016.
 */
public abstract class Employee {
    String _name;
    String _id;

    public Employee(String empName, String empID) {
        _name = empName;
        _id = empID;
    }

    public String getName() {
        return _name;
    }

    public String getID() {
        return _id;
    }

    @Override
    public String toString() {
        return " Emp name:: " + getName() + " EmpID:: " + getID() + "\n";
    }

    public void save() {
        try {
            File fileName = new File("emp.txt");

            FileUtils.writeStringToFile(fileName, this.toString(), "UTF-8", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String computeCompensation();
}
