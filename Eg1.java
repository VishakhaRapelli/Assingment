package Methodover;
 class Employee1 {
	 protected double salary;
public Employee1(double salary) {
	        this.salary = salary;
	    }
public void incrementSalary() {
	        salary += 1000;
	    }
public void printSalary() {
	        System.out.println("Salary: " + salary);
	    }
	}
 class Developer extends Employee1 {
	    public Developer(double salary) {
	        super(salary);
	    }
	    @Override
	    public void incrementSalary() {
	        salary += 2000;
	    }
	}
 class Manager extends Employee1 {
	    public Manager(double salary) {
	        super(salary);
	    }
	    @Override
	    public void incrementSalary() {
	        salary += 3000;
	    }
	}
public class Eg1 {
	public static void main(String[] args) {
    Employee1 employee = new Employee1(50000);
    Developer developer = new Developer(60000);
    Manager manager = new Manager(70000);
    employee.incrementSalary();
    developer.incrementSalary();
    manager.incrementSalary();
    employee.printSalary(); // prints "Salary: 51000.0"
    developer.printSalary(); // prints "Salary: 62000.0"
    manager.printSalary(); // prints "Salary: 73000.0"
}


}
