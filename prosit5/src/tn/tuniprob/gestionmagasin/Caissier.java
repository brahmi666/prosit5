package tn.tuniprob.gestionmagasin;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(id, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbr_heures * 5;
        if (nbr_heures > 180) {
            salaire += (nbr_heures - 180) * 5 * 0.15;
        }
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", caissier et num caisse: " + numeroDeCaisse;
    }
}
