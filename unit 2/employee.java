import java.io.*;
import java.util.*;

class Employee{
   private String name;
   private String department;
   private double basicSalary;
    public Employee(String a, String b, double c){
        this.name = a;
        this.department = b;
        this.basicSalary = c;
    }
    public void setname(String a){
        this.name = a;
    }
    public void setdepartment(String b){
        this.department = b;
    }
    public void setbasicSalary(double c){
        this.basicSalary =c;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public double getBasicSalary(){
        return basicSalary;
    }
    public double calculateNetSalary(){
        double allowance = 0.20 * basicSalary;
        double deduction = 0.10 * basicSalary;
        return basicSalary+allowance-deduction;
    }
    public void display(){
        System.out.println("Employee Name : "+getName());
        System.out.println("Department : "+getDepartment());
        System.out.println("Basic Salary : "+getBasicSalary());
        System.out.println("Net Salary : "+calculateNetSalary());
    } 
} 
public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees");
        int n = sc.nextInt();
        sc.nextLine();
        Employee e[]=new Employee[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the details of Employees " +(i+1));
            String input = sc.nextLine();
            String arr[]= input.split(",");
            String a = arr[0];
            String b = arr[1];
            double c = Double.parseDouble(arr[2]);
            e[i]= new Employee(a,b,c);
        }
        System.out.println("Employee Payroll Details");
        for(int i =0;i<n;i++){
            e[i].display();
        }
        
    }
}