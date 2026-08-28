
class Employee {
    String name;
    double salary;
    final String companyName;

    Employee(String name, double salary, String companyName) {
        this.name = name;
        this.salary = salary;
        this.companyName = companyName;
    }

    double calculateBonus() {
        return salary * 0.05;
    }
}

class Manager extends Employee {

    Manager(String name, double salary, String companyName) {
        super(name, salary, companyName);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

class SeniorManager extends Manager {
    double retentionBonus;

    SeniorManager(String name, double salary,
                  String companyName, double retentionBonus) {

        super(name, salary, companyName);
        this.retentionBonus = retentionBonus;
    }

    @Override
    double calculateBonus() {
        return salary * 0.15 + retentionBonus;
    }
}

public class Q5EmployeeBonus {
    public static void main(String[] args) {

        Employee e1 =
                new Employee("Aby", 30000, "TechCorp");

        Manager e2 =
                new Manager("Rahul", 50000, "TechCorp");

        SeniorManager e3 =
                new SeniorManager("Anu", 80000,
                                   "TechCorp", 10000);

        System.out.println("Employee Bonus: " +
                           e1.calculateBonus());

        System.out.println("Manager Bonus: " +
                           e2.calculateBonus());

        System.out.println("Senior Manager Bonus: " +
                           e3.calculateBonus());
    }
}