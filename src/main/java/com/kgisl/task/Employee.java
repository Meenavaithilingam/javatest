package com.kgisl.task;

/**
 * Employee
 */
public class Employee {
    int empid;
    String name;
    float salary;
public Employee(){
    this("Meena");
}
public Employee(String name)
{
    this(name, 120035);
}
public Employee(String name, int sal)
{
    
    this(name, salary, 22);
}
    Employee(int empid, String name, float salary) {
        this.empid=empid;
        this.name=name;
        this.salary=salary;
    }
void print(){
    System.out.println("Employee");
    System.out.println();
    System.out.println();
}
public static void main(String[] args) {
    Employee e=new Employee();
    e.print();
}
}