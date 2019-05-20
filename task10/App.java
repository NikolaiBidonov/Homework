package ru.bidonov.task10;

public class App {


    public static void main (String[] args) {

        VendingMachine vm = new VendingMachine ();

        vm.addMoney ();

        vm.showMenu ();

        vm.choiceDrink ();
    }
}
