package org.example.api;

/**
 * Interface for visited node.
 */
public interface Node {
    /**
     * Accept visitor.
     * <p/>
     *
     * @param visitor {@link Visitor} instance.
     */
    void accept(Visitor visitor);
}
