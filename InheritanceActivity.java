class Employee
{
	long employeeId,employee_Phone;
	String employeeName,employee_Address;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;
	

Employee(long id,String name,String address,long phone,double salary)
{
	this.employeeId = id;
    this.employeeName = name;
    this.employee_Address = address;
    this.employee_Phone = phone;
    this.basicSalary = salary;
}
void calculateSalary() {
    double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
    System.out.println("Salary: " + salary);
}
}
class Manager extends Employee {

    Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone, salary);
    }
    void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        System.out.println("Salary: " + salary);
    }
}
public class InheritanceActivity {
	public static void main(String[] args) {
        Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        manager.calculateSalary();
    }
}