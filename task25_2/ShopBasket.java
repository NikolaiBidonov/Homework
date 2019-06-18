package ru.bidonov.task25_2;

import java.util.HashMap;
import java.util.Map;

public class ShopBasket implements Basket {
    Map<String, Integer> basket = new HashMap<> ();

    @Override
    public void addProduct (String product, Integer quantity) {
        basket.put (product, quantity );
    }

    @Override
    public void removeProduct (String product) {
        for (Map.Entry<String, Integer> m: basket.entrySet ()) {
            if ((product.equals (m.getKey ()))) {
                basket.remove (product);
            }
        }
        System.out.println ("Товар " + product + " удален");
    }

    @Override
    public void updateProductQuantity (String product, Integer quantity) {
        for (Map.Entry<String, Integer> m: basket.entrySet ()) {
            if (product.equals (m.getKey ())) {
                basket.put (product, quantity);
            }
        }
        System.out.println ("Количесвто товара <" + product + "> изменено на " + basket.values () );

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
        for (Map.Entry<String, Integer> m:basket.entrySet ()) {
           if (product.equals (m.getKey ())) {
               System.out.println ("В корзине " + basket.values () + " товар <" + product + ">");
           }
        }
    }
}