package ru.bidonov.task23;

import java.util.ArrayList;
import java.util.Iterator;

public class ShopBasket implements Basket {
    ArrayList<Product> basket = new ArrayList<> ();
    
    @Override
    public void addProduct (String product, int quantity) {
        basket.add (new Product (product, quantity));
    }

    @Override
    public void removeProduct (String product) {
        Iterator<Product> iterator = basket.iterator ();
        while (iterator.hasNext ()) {
            Product nextProd = iterator.next ();
            if (nextProd.getProduct ().equals (product)) {
                iterator.remove ();
            }
        }
        System.out.println ("Товар " + product + " удален");
    }

    @Override
    public void updateProductQuantity (String product, int quantity) {
        Iterator<Product> iterator = basket.iterator ();
        while (iterator.hasNext ()) {
            Product nextProd = iterator.next ();
            if (nextProd.getProduct ().equals (product)) {
                nextProd.setQuantity (quantity);
            }
        }
        System.out.println ("Количество товара " + product + " изменено на " + quantity);
    }


    @Override
    public void clearBasket () {
        basket.clear ();
        System.out.println ("Корзина очищена");
    }

    @Override
    public void getProducts () {
        System.out.println ("В вашей корзине: " + basket);
    }

    @Override
    public void getProductQuantity (String product) {
        Iterator<Product> iterator = basket.iterator ();
        while (iterator.hasNext ()) {
            Product nextProd = iterator.next ();
            if (nextProd.getProduct ().equals (product)) {
                System.out.println ("В корзине " + nextProd.getQuantity () + " товара " + nextProd.getProduct ());
            }
        }
    }
}