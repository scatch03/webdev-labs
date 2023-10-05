package org.example.implementation.renderer;

import org.example.api.Renderer;

/**
 * JSON content renderer.
 */
public class JsonRenderer implements Renderer {
    /**
     * {@inheritDoc}
     */
    @Override
    public void start() {
        System.out.println("{");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void write(final String field, final Object value) {
        System.out.printf("\"%s\": \"%s\",%n", field, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void end() {
        System.out.println("}\n");
    }
}
