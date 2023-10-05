package org.example.implementation.page;

import org.example.api.Renderer;

/**
 * Simple page.
 */
public class SimplePage {
    /**
     * {@link org.example.api.Renderer} instance.
     */
    protected final Renderer renderer;

    /**
     * Constructor.
     * <p/>
     *
     * @param renderer {@link org.example.api.Renderer} instance.
     */
    public SimplePage(final Renderer renderer) {
        this.renderer = renderer;
    }

    /**
     * Start page.
     */
    public void startPage() {
        renderer.start();
    }

    /**
     * Add page title.
     * <p/>
     *
     * @param title
     *          {@link java.lang.String} page title.
     */
    public void addTitle(final String title){
        renderer.write("title", title);
    }

    /**
     * Add page content.
     * <p/>
     *
     * @param content
     *          {@link java.lang.String} content.
     */
    public void addContent(final String content){
        renderer.write("content", content);
    }

    /**
     * End page.
     */
    public void endPage(){
        renderer.end();
    }
}
