public class Employee {
    public String name;
    public int id;
    public double salary;
    public String department;
    public static final double BONUS_RATE = 0.1;

    public Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public void applyBonus() {
        double bonus = salary * BONUS_RATE;
        salary += bonus;
        System.out.println("Bonus applied! New salary: " + salary);
    }

    public void updateDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("Department updated to: " + department);
    }
} 
public class Employee {
    public String name;
    public int id;
    public double salary;
    public String department;
    public static final double BONUS_RATE = 0.1;

    public Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public void applyBonus() {
        double bonus = salary * BONUS_RATE;
        salary += bonus;
        System.out.println("Bonus applied! New salary: " + salary);
    }

    public void updateDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("Department updated to: " + department);
    }
}