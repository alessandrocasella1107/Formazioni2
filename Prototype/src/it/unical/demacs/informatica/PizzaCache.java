package it.unical.demacs.informatica;

import it.unical.demacs.informatica.ClassiConcretePizza.Calabrese;
import it.unical.demacs.informatica.ClassiConcretePizza.Margherita;
import it.unical.demacs.informatica.ClassiConcretePizza.Viennese;

import java.util.Hashtable;

public class PizzaCache {
    private static Hashtable<String, Pizza> pizzaMap= new Hashtable<String, Pizza>();

    public static Pizza getPizza(String pizzaNome){
        Pizza pizzaTipo= pizzaMap.get(pizzaNome);
        return (Pizza) pizzaTipo.clone();
    }

    public static void caricaCache(){
        Margherita margherita= new Margherita();
        margherita.setNome("Margherita");
        pizzaMap.put(margherita.getNome(), margherita);

        Viennese viennese= new Viennese();
        viennese.setNome("Viennese");
        pizzaMap.put(viennese.getNome(), viennese);

        Calabrese calabrese= new Calabrese();
        calabrese.setNome("Calabrese");
        pizzaMap.put(calabrese.getNome(), calabrese);
    }

}
