package com.company;

public class Employee {

    private final int ID;
    private String firstName, lastName;
    private double salary;
    private MyDate birthDate;
    private static int counter = 0;

    public  Employee(String firstName, String lastName, double salary, MyDate birthDate)
    {
        this.ID = counter;
        counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Firstname: " + this.firstName +
                "Lastname: " + this.lastName +
                "Salary: " + this.salary +
                "Birth Date: " + this.birthDate +
                "ID: " + this.ID;
    }
}
