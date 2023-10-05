package org.example.implementation.renderer;

import org.example.api.Renderer;

/**
 * XML content renderer.
 */
public class XmlRenderer implements Renderer {
    /**
     * {@inheritDoc}
     */
    @Override
    public void start() {
        System.out.println("<xml>");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void write(final String field, final Object value) {
        System.out.printf("<%s>%s</%s>%n", field, value, field);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void end() {
        System.out.println("</xml>\n");
    }
}
