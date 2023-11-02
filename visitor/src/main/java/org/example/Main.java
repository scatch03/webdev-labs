package org.example;

import org.example.api.Visitor;
import org.example.implementation.Company;
import org.example.implementation.Department;
import org.example.implementation.Employee;
import org.example.implementation.SalaryReportVisitor;

public class Main {

    public static void main(final String[] args) {
        final Department itDep = new Department(new Employee[]{
                new Employee("DevOps", 90_000),
                new Employee("Designer", 60_000),
                new Employee("Back-End Developer", 80_000),
                new Employee("Front-End Developer", 75_000),
        });
        final Department salesDep = new Department(new Employee[]{
                new Employee("Sales Manager", 65_000),
                new Employee("Sales Manager", 60_000),
                new Employee("Account Manager", 70_000),
        });
        final Company company = new Company(new Department[]{
                itDep, salesDep
        });

        final Visitor salaryVisitor = new SalaryReportVisitor();

        System.out.println("Company Salaries:");
        salaryVisitor.visit(company);

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("IT Department Salaries:");
        salaryVisitor.visit(itDep);
    }
}
