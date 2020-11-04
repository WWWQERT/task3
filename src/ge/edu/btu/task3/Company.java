package ge.edu.btu.task3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company implements initCompany
{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Company(){};

    public Company(String name)
    {
        this.name=name;
    }


    private Map<EmployeeType, List<Employee>> employeeMap = new HashMap<>();


    @Override
    public void initEmployees()
        {
            for (EmployeeType type : EmployeeType.values()) {
                employeeMap.put(type, new ArrayList<>());
            }

    }

    @Override
    public void addEmployee(EmployeeType type, Employee employee){
            employeeMap.get(type).add(employee);
        }

    @Override
    public Map<EmployeeType, Double> getAverageSalary() {
        Map<EmployeeType, Double> getAverageSalary = new HashMap<>();
        for (EmployeeType type: employeeMap.keySet())
        {
            List<Employee> employees = employeeMap.get(type);
            double sum = 0.0;
            for (Employee employee : employees)
            {
                sum=sum+ employee.getSalary();
            }
            double avarage = 0.0;
            if(!employees.isEmpty())
            {
                avarage = sum / employees.size();
            }
            getAverageSalary.put(type,avarage);
        }
        return getAverageSalary;
    }

    @Override
    public  void printInfo() {
        for (EmployeeType group : employeeMap.keySet()) {
            System.out.println("ჯგუფი: " + group);
            for (Employee student : employeeMap.get(group)) {
                System.out.println(student.getName() + ": " + student.getSalary());
            }
        }

    }


}
