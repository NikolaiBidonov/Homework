package ru.bidonov.task5;

public class App {


    public static void main (String[] args) {

        VendingMachine vm = new VendingMachine();

        vm.ShowMenu ();

        vm.AddMoney ();

        vm.ChoiceDrink ();
    }
}
