package io.cloudstore.front.china.product;

import java.io.Serializable;

/**
 * @author chanwook
 */
public class ProductResource implements Serializable {
    private String id;
    private String name;
    private int price;

    public ProductResource() {
    }

    public ProductResource(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
