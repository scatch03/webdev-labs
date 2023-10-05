package org.example.implementation.page;

import org.example.api.Renderer;
import org.example.implementation.Product;

/**
 * Product page.
 */
public class ProductPage extends SimplePage {
    /**
     * Constructor.
     * <p/>
     *
     * @param renderer {@link org.example.api.Renderer} instance.
     */
    public ProductPage(final Renderer renderer) {
        super(renderer);
    }

    /**
     * Add product to the page.
     * <p/>
     *
     * @param product
     *          {@link org.example.implementation.Product} instance.
     */
    public void addProduct(final Product product){
        renderer.write("productId", product.getId());
        renderer.write("productTitle", product.getTitle());
        renderer.write("productDescription", product.getDescription());
        renderer.write("productImage", product.getImage());
    }
}
