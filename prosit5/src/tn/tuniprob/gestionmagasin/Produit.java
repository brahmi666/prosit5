package tn.tuniprob.gestionmagasin;
import java.time.LocalDate;

public class Produit {
    public int identifiant;
    public String libelle;
    public String marque;
    public float prix;
    public LocalDate date;

    public Produit(int identifiant, String libelle, String marque, float prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public void afficher(Produit p) {
        System.out.println("id: " + p.identifiant +" libellé " + p.libelle +" marque " + p.marque +
                " prix " + p.prix +" date " + p.date);
    }

    @Override
    public String toString() {
        return "id: " + this.identifiant +" libellé " +
                this.libelle +" marque " + this.marque +" prix "
                + this.prix +" date " + this.date;
    }

    public boolean comparer(Produit prd) {
        return this.identifiant == prd.identifiant &&
                this.libelle.equalsIgnoreCase(prd.libelle) &&
                this.prix == prd.prix;
    }

    public static boolean comparer(Produit p1, Produit p2) {
        return p1.identifiant == p2.identifiant &&
                p1.libelle.equalsIgnoreCase(p2.libelle) &&
                p1.prix == p2.prix;
    }
}
