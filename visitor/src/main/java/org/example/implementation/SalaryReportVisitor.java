package org.example.implementation;

import org.example.api.Visitor;

/**
 * Visitor for collecting salary data.
 */
public final class SalaryReportVisitor implements Visitor {

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(final Employee employee) {
        System.out.println(employee.getPosition() + ":" + employee.getSalary());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(final Department department) {
        for (final Employee employee : department.getEmployees()) {
            visit(employee);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(final Company company) {
        for (final Department department : company.getDepartments()) {
            visit(department);
        }
    }
}
