package tn.tuniprob.gestionmagasin;

public class Main {
    public static void main(String[] args) {
        Magasin magasingenerale = new Magasin(1, "magasingenerale", "Centre-Ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah 6");



        magasingenerale.ajouteremp(new Caissier(1, "feres", "EZZOUHOUR", 700, 666));
        magasingenerale.ajouteremp(new Caissier(2, "rmi ssi", "gafa centre", 10, 69));

        magasingenerale.ajouteremp(new Vendeur(3, "chams", "mannouba", 160, 120));

        magasingenerale.ajouteremp(new Responsable(4, "benali", "benarous", 170, 500));
        magasingenerale.ajouteremp(new Responsable(4, "benali", "benarous", 170, 500));

        monoprix.ajouteremp(new Caissier(5, "Hatem", "Menzah", 185, 201));
        monoprix.ajouteremp(new Vendeur(6, "Mouna", "Menzah", 150, 110));
        monoprix.ajouteremp(new Vendeur(7, "Firas", "Menzah", 140, 130));
        monoprix.ajouteremp(new Vendeur(8, "Sonia", "Menzah", 160, 100));
        monoprix.ajouteremp(new Responsable(9, "Rami", "Menzah", 180, 600));

        magasingenerale.ajouter(new Produit(1, "Lait", "Delice", 2.5f));
        magasingenerale.ajouter(new Produit(2, "Pain", "Baguette", 1.0f));
        monoprix.ajouter(new Produit(3, "Jus", "Vitalait", 3.0f));
        monoprix.ajouter(new Produit(4, "Eau", "Safia", 0.8f));

        magasingenerale.afficher();
        monoprix.afficher();


        System.out.println("Salaires magasingenerale:");

        for (Employe e : magasingenerale.getEmployes()) {
            if (e != null) {
                System.out.println(e.nom + ": " + e.calculerSalaire() + " DT");
            }
        }
        System.out.println("Salaires Monoprix:");
        for (Employe e : monoprix.getEmployes()) {
            if (e != null) {
                System.out.println(e.nom + ": " + e.calculerSalaire() + " DT");
            }
        }
            for (int i=0;i<magasingenerale.nbr_emp;i++){
                    System.out.println(magasingenerale.tabemp[i].toString());
         }

         int caissiersCount = 0, vendeursCount = 0, responsablesCount = 0;
         for (int i = 0; i < magasingenerale.nbr_emp; i++) {
             Employe emp = magasingenerale.tabemp[i];
             if (emp instanceof Caissier) {
                 caissiersCount++;
             } else if (emp instanceof Vendeur) {
                 vendeursCount++;
             } else if (emp instanceof Responsable) {
                 responsablesCount++;
             }
         }
         System.out.println("Nombre de caissiers: " + caissiersCount);
         System.out.println("Nombre de vendeurs: " + vendeursCount);
         System.out.println("Nombre de responsables: " + responsablesCount);

         Caissier emp1 = new Caissier(1, "feres", "EZZOUHOUR", 700, 666);
         Caissier emp2 = new Caissier(1, "feres", "EZZOUHOUR", 700, 666);
         Caissier emp3 = new Caissier(12, "feres", "EZZOUHOUR", 700, 666);

         System.out.println(" "+ emp1.equals(emp2));
         System.out.println(" "+ emp1.equals(emp3));

    }
}














/*
package tn.tuniprob.gestionmagasin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit(101, "Lait", "Delice", 1.2f, LocalDate.now());
        Produit p2 = new Produit(101, "Lait", "Delice", 1.2f, LocalDate.now());
        Produit p3 = new Produit(102, "Pain", "Baguette", 0.5f, LocalDate.now());
        Magasin m1 = new Magasin(1, "Tunis");
        m1.ajouter(p1);
        m1.ajouter(p3);

        Magasin m2 = new Magasin(2, "Sfax");
        m2.ajouter(p2);
        m2.ajouter(p3);
        System.out.println("--------------------------------------");
        m1.afficher();
        m2.afficher();

        System.out.println("comparer p1 et p2" + p1.comparer(p2));
        System.out.println("Comparer(p1,p2): " + Produit.comparer(p1, p2));
        System.out.println("Comparer(p1,p3): " + Produit.comparer(p1, p3));


        System.out.println("produits total dans tous les magasins: " + Magasin.getTotalmagasins());
        m1.ajouter(p1);

        Magasin maxMagasin = Magasin.comparer(m1, m2);
        if (maxMagasin != null) {
            System.out.println("magasin avec plus de produits est:" + maxMagasin);
        } else {
            System.out.println("les deux magasins ont le meeme produits n");
        }

    }

}

*/