package org.example.implementation.renderer;

import org.example.api.Renderer;

/**
 * HTML content renderer.
 */
public class HtmlRenderer implements Renderer {
    private boolean bodyIsWritten;

    /**
     * {@inheritDoc}
     */
    @Override
    public void start() {
        System.out.println("<html>");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void write(final String field, final Object value) {
        switch (field) {
            case "title":
                System.out.println("<head>");
                System.out.printf("<title>%s</title>%n", value);
                System.out.println("</head>");
                break;
            case "content":
                if (!bodyIsWritten) {
                    System.out.printf("<body>%n");
                    bodyIsWritten = true;
                }
                System.out.printf("%s%n", value);
                break;
            case "productId":
            case "productTitle":
            case "productDescription":
            case "productImage":
            default:
                if (!bodyIsWritten) {
                    System.out.printf("<body>%n");
                    bodyIsWritten = true;
                }
                System.out.printf("<div>%s: %s</div>%n", field, value);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void end() {
        System.out.println("</body>\n</html>\n");
    }
}
