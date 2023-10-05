package org.example.implementation;

import java.net.URI;

/**
 * Product data.
 */
public final class Product {
    private final String id;
    private final String title;
    private final String description;
    private final URI image;

    /**
     * Covering constructor.
     * <p/>
     *
     * @param id          {@link java.lang.String} unique product id.
     * @param title       {@link java.lang.String} product title.
     * @param description {@link java.lang.String} product description.
     * @param image       {@link java.net.URI} product image link.
     */
    public Product(final String id,
                   final String title,
                   final String description,
                   final URI image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public URI getImage() {
        return image;
    }
}
