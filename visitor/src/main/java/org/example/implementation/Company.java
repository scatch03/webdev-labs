package org.example.implementation;

import org.example.api.Node;
import org.example.api.Visitor;

/**
 * Company information.
 */
public final class Company implements Node {
    private final Department[] departments;

    public Company(final Department[] departments) {
        this.departments = departments;
    }

    public Department[] getDepartments() {
        return departments;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
