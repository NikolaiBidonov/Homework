package ru.bidonov.task25_2;

public class App {
    public static void main (String[] args) {
        ShopBasket sb = new ShopBasket ();
        sb.addProduct ("Чай", 1);
        sb.addProduct ("Молоко", 2);
        sb.addProduct ("Чай", 8);
        sb.getProducts ();
        sb.removeProduct ("Молоко");
        sb.getProducts ();
        sb.getProductQuantity ("Чай");
        sb.updateProductQuantity ("Чай", 4);
        sb.getProductQuantity ("Чай");
        sb.getProducts ();
        //sb.clearBasket ();
    }
}
