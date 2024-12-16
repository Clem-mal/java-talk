package code.jep447;

public class Vehicule {

    public void mouvement() {
        System.out.println("Le véhicule se déplace");
    }

    public boolean vitesseMax(int vitesse) {
        return vitesse > 300;
    }
}
