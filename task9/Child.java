package ru.bidonov.task9;

public class Child {

    private Food [] goodFood = {Food.APPLE, Food.CAKE, Food.SOUP};

    public void eat (Food food) throws Exception {
        try {
            for (Food tmpFood : goodFood) {
                if (food.equals (tmpFood)) {
                    System.out.println ("Съел " + tmpFood.getTitle ());
                    return;
                }
            }
            throw new Exception ("Еда не съедена");
        } finally {
            System.out.println ("Спасибо, мама!");
        }
    }
}




