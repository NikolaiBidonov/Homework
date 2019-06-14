package ru.bidonov.task23;


public interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clearBasket();

    void getProducts();

    void getProductQuantity(String product);

}
