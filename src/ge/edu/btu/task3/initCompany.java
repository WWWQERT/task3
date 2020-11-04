package ge.edu.btu.task3;
import java.util.Map;

public interface initCompany {
    void initEmployees();

    void addEmployee(EmployeeType type, Employee employee);

    Map<EmployeeType, Double> getAverageSalary();

    void printInfo();



}
