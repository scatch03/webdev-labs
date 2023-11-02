package org.example.api;

import org.example.implementation.Company;
import org.example.implementation.Department;
import org.example.implementation.Employee;

/**
 * Visitor interface.
 */
public interface Visitor {
    /**
     * Visit employee.
     * <p/>
     *
     * @param employee {@link Employee} instance.
     */
    void visit(Employee employee);
    /**
     * Visit department.
     * <p/>
     *
     * @param department {@link Department} instance.
     */
    void visit(Department department);
    /**
     * Visit company.
     * <p/>
     *
     * @param company {@link Company} instance.
     */
    void visit(Company company);
}
