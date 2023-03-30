package com.cognizant.tax;

public class TaxCalculator {
	private float basicSalary;
    private float tax;
    private int nettSalary;



    public TaxCalculator(float basicSalary) {
        this.basicSalary = basicSalary;
 
        this.tax = 0.0f;
        this.nettSalary = 0;
    }
    public void calculateTax() {
        this.tax = 30 * this.basicSalary / 100;
        System.out.printf("The Tax of the employee for the %.2f is %.2f\n", this.basicSalary, this.tax);
        
    }
    public void deductTax() {
        this.nettSalary = (int)(this.basicSalary - this.tax);
        System.out.printf("The nett salary of the employee is %d\n", this.nettSalary);
        TaxCalculator employee = new TaxCalculator(50000);
        employee.calculateTax();  
        employee.deductTax(); 
    }


}
