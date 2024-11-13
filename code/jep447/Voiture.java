package code.jep447;

public class Voiture extends Vehicule {

    private String marque;

    public Voiture(String marque) {
        super();
        if (marque == null || marque.isEmpty()) {
            throw new IllegalArgumentException("La marque ne peut pas être nulle ou vide");
        }

        this.marque = marque;
        System.out.println("Une voiture de la marque " + marque + " est créée");
    }
}
