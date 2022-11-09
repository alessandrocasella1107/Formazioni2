package it.unical.demacs.informatica;

public class Main {

    public static void main(String[] args) {
        PizzaCache.caricaCache();

        Pizza pizza1=(Pizza) PizzaCache.getPizza("Margherita");
        System.out.println("Pizza : " + pizza1.getNome() + " ingredienti : " + pizza1.getIngredienti());

        Pizza pizza2=(Pizza) PizzaCache.getPizza("Viennese");
        System.out.println("Pizza : " + pizza2.getNome() + " ingredienti : " + pizza2.getIngredienti());

        Pizza pizza3=(Pizza) PizzaCache.getPizza("Calabrese");
        System.out.println("Pizza : " + pizza3.getNome() + " ingredienti : " + pizza3.getIngredienti());
    }
}
