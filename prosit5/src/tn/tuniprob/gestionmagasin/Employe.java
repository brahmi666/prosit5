package tn.tuniprob.gestionmagasin;

public abstract class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbr_heures;

    public Employe(int id, String nom, String adresse, int nbr_heures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public abstract double calculerSalaire();

    public String toString() {
        return "id: " + id + ", nom: " + nom + ", adresse: " + adresse +
         ", heures: " + nbr_heures + ", salaire: " + calculerSalaire();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return this.id == employe.id &&
               this.nbr_heures == employe.nbr_heures &&
               this.nom.equals(employe.nom) &&
               this.adresse.equals(employe.adresse);
    }
}
