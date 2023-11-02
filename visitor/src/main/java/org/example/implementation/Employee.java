package org.example.implementation;

import org.example.api.Node;
import org.example.api.Visitor;

/**
 * Employee information.
 */
public final class Employee implements Node {
    private final String position;
    private final float salary;

    public Employee(final String position, final float salary) {
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public float getSalary() {
        return salary;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
