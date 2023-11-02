package org.example.implementation;

import org.example.api.Node;
import org.example.api.Visitor;

/**
 * Department information.
 */
public final class Department implements Node {
    private final Employee[] employees;

    public Department(final Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
