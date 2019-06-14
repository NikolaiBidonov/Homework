package ru.bidonov.task23;

public class App {
    public static void main (String[] args) {
        ShopBasket sb = new ShopBasket ();
        sb.addProduct ("Чай", 2);
        sb.addProduct ("Молоток", 1);
        sb.addProduct ("Молоко", 1);
        sb.addProduct ("Хлеб", 2);
        sb.removeProduct ("Молоток");
        sb.getProductQuantity ("Хлеб");
        sb.updateProductQuantity ("Хлеб", 4);
        sb.getProductQuantity ("Чай");
        sb.getProductQuantity ("Хлеб");
        sb.getProducts ();
        sb.clearBasket ();

    }
}
