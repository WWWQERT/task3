package ge.edu.btu.task3;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Employee employee1 = new Employee('akaki',233);
        Employee employee2 = new Employee('vaja',400);
        Employee employee3 = new Employee('ilia',643);
        Employee employee4 = new Employee('galaktioni',100000);

        Company company = new Company("BTU-SUCKS");
        company.initEmployees();

        company.addEmployee(EmployeeType.FRONT_END,employee1);
        company.addEmployee(EmployeeType.BACK_END,employee2);
        company.addEmployee(EmployeeType.FRONT_END,employee3);
        company.addEmployee(EmployeeType.ARCHITECT,employee4);

        Company.printInfo();

        Map<EmployeeType, Double> averageSalary = Company.getAverageSalary();
        System.out.println(averageSalary);




    }
}
