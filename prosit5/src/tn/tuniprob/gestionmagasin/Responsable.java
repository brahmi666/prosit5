package tn.tuniprob.gestionmagasin;

public class Responsable extends Employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbr_heures, double prime) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbr_heures * 10;
        if (nbr_heures > 160) {
            salaire += (nbr_heures - 160) * 10 * 0.2;
        }
        return salaire + prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", responsable et Prime: " + prime;
    }

    public double getPrime() {
        return this.prime;
    }
}
