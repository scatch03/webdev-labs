package org.example;

import org.example.implementation.Product;
import org.example.implementation.page.ProductPage;
import org.example.implementation.page.SimplePage;
import org.example.implementation.renderer.HtmlRenderer;
import org.example.implementation.renderer.JsonRenderer;
import org.example.implementation.renderer.XmlRenderer;

import java.net.URI;

public class Main {
    public static void main(String[] args) {
        final SimplePage blogHtml = new SimplePage(new HtmlRenderer());
        blogHtml.startPage();
        blogHtml.addTitle("My Awesome Blog");
        blogHtml.addContent("This is my blog");
        blogHtml.endPage();

        final SimplePage blogXml = new SimplePage(new XmlRenderer());
        blogXml.startPage();
        blogXml.addTitle("My Awesome Blog");
        blogXml.addContent("This is my blog");
        blogXml.endPage();

        final SimplePage blogJson = new SimplePage(new JsonRenderer());
        blogJson.startPage();
        blogJson.addTitle("My Awesome Blog");
        blogJson.addContent("This is my blog");
        blogJson.endPage();

        System.out.println("\n"); //////////////////////////////////////////////////////////////////////////////////////

        final Product product = new Product("1", "PC", "Workstation", URI.create("http://pc.com/1"));
        final ProductPage productHtml = new ProductPage(new HtmlRenderer());
        productHtml.startPage();
        productHtml.addTitle("My Awesome Blog");
        productHtml.addProduct(product);
        productHtml.endPage();

        final ProductPage productXml = new ProductPage(new XmlRenderer());
        productXml.startPage();
        productXml.addTitle("My Awesome Blog");
        productXml.addProduct(product);
        productXml.endPage();

        final ProductPage productJson = new ProductPage(new JsonRenderer());
        productJson.startPage();
        productJson.addTitle("My Awesome Blog");
        productJson.addProduct(product);
        productJson.endPage();
    }
}
