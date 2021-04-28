package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Company{
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name)
    {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hire(Employee employee)
    {
        employees.add(employee);
    }

    public void fire(int ID)
    {
        for (int i = 0; i < employees.size(); i++) {
            if(ID == employees.get(i).getID())
            {
                employees.remove(i);
            }
        }
    }

    public void hireAll(String fileName)
    {
        Scanner scanner = null;

        try{
            scanner = new Scanner(new File(fileName));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        if(scanner == null)
        {
            System.out.println("Error!");
        }

        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();

            if(line.isEmpty())
            {
                continue;
            }

            Employee employee;
            MyDate birthDate;

            String[] items = line.split(", ");

            if(items[6] != " ")
            {
                birthDate = new MyDate(Integer.parseInt(items[3].trim()), Integer.parseInt(items[4].trim()), Integer.parseInt(items[5].trim()));
                employee = new Employee(items[0].trim(), items[1].trim(), Integer.parseInt(items[2].trim()),birthDate);
                employees.add(new Manager(employee.getFirstName(),employee.getLastName(), employee.getSalary(), employee.getBirthDate(), items[6].trim()));
            }

            birthDate = new MyDate(Integer.parseInt(items[3].trim()), Integer.parseInt(items[4].trim()), Integer.parseInt(items[5].trim()));
            employee = new Employee(items[0].trim(), items[1].trim(), Integer.parseInt(items[2].trim()),birthDate);
            employees.add(new Employee(employee.getFirstName(),employee.getLastName(), employee.getSalary(), employee.getBirthDate()));
        }

    }

    public void printAll(PrintStream ps)
    {
        ps.println("ID, Firstname, LastName, Salary, Birth Date");

        for(Employee e : employees)
        {
            e.toString();
        }
    }

    public void printManangers(PrintStream ps)
    {
        ps.println("ID, Firstname, LastName, Salary, Birth Date");

        for(Employee e : employees)
        {
            if(e instanceof Manager)
            {
                Manager tmp = (Manager)e;
               tmp.toString();
            }
        }
    }


    public void sortByComparator(Comparator<Employee>)
    {

    }
}
