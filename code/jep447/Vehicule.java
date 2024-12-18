package code.jep447;

import java.util.function.BiFunction;

public class Vehicule {

    public void mouvement() {
        System.out.println("Le véhicule se déplace");
    }

    public boolean vitesseMax(int vitesse) {
        return vitesse > 300;
    }

    public String check(Object o) {
        return switch (o) {
            case Integer i -> "C'est un entier";
            case Float f -> "C'est un nombre à virgule";
            case Voiture voiture -> "C'est un objet Car";
            default -> "Je ne sais pas ce que c'est";
        };
    }

    BiFunction<Integer, String, Integer> processAOnly = (a, b) -> a * 2;
}
