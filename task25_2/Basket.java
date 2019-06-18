package ru.bidonov.task25_2;


public interface Basket {
    void addProduct (String product, Integer quantity);

    void removeProduct (String product);

    void updateProductQuantity (String product, Integer quantity);

    void clearBasket ();

    void getProducts ();

    void getProductQuantity (String product);

}
