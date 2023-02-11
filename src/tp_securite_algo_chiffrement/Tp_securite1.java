package tp_securite1;

import java.util.Scanner;

/**
 *
 * @author MILD
 */
public class Tp_securite1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lire les élèment de la clé K
        int tab1[] = new int[8];
        Scanner milolo = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("saisissez le bit de position " + i + ":");
            tab1[i] = milolo.nextInt();
        }
        //Affichage des données de la clé K 
        for (int i = 0; i < 8; i++) {
            System.out.print(tab1[i] + "|");
        }
        System.out.println(" = K");

        //Lecture des élèments des élèments de la fonction de permutation   
        int tab2[] = new int[8];
        for (int j = 0; j < 8; j++) {
            System.out.print("saisissez la valeur de la fonction position " + j + ":");
            tab2[j] = milolo.nextInt();
        }
        //Affichage de données de la fonction de permutation 
        for (int j = 0; j < 8; j++) {
            System.out.print(tab2[j] + "|");
        }
        System.out.println(" = Fonction de permutation ");

        //Application de la fonction de permutation  
        System.out.print("La fonction de permutation devienne : " + tab1[6] + "|" + tab1[5] + "|" + tab1[2] + "|" + tab1[7] + "|" + tab1[4] + "|" + tab1[1] + "|" + tab1[3] + "|" + tab1[0]);
        System.out.println("");

        //Affectation K1
        System.out.print(" k1 = " + tab1[6] + "|" + tab1[5] + "|" + tab1[2] + "|" + tab1[7]);
        System.out.println("");
        //Affectation K2
        System.out.print(" k2 = " + tab1[4] + "|" + tab1[1] + "|" + tab1[3] + "|" + tab1[0]);
        System.out.println("");
        System.out.print("k'1 = ");
        if (tab1[6] == tab1[4]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tab1[5] == tab1[1]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tab1[2] == tab1[3]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tab1[7] == tab1[0]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
            System.out.println("");
        }
        System.out.print(" k'2 = ");
        if (tab1[6] == tab1[4]) {
            System.out.print(1 + "|");
        } else if (tab1[6] == 0 && tab1[4] == 0) {
            System.out.print(0 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tab1[5] == tab1[1]) {
            System.out.print(1 + "|");
        } else if (tab1[5] == 0 && tab1[1] == 0) {
            System.out.print(0 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tab1[2] == tab1[3]) {
            System.out.print(1 + "|");
        } else if (tab1[2] == 0 && tab1[3] == 0) {
            System.out.print(0 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tab1[7] == tab1[0]) {
            System.out.print(1 + "|");
        } else if (tab1[7] == 0 && tab1[0] == 0) {
            System.out.print(0 + "|");
        } else {
            System.out.print(0 + "|");
            System.out.println("");
        }
        //Application de decalage à gauche pour k1
        System.out.println("k1 = G2(k1) = " + tab1[2] + "|" + tab1[7] + "|" + tab1[6] + "|" + tab1[5]);

        //Application de decalage à droite pour k2
        System.out.println("k2 = D1(k2) = " + tab1[0] + "|" + tab1[4] + "|" + tab1[1] + "|" + tab1[3]);
    }

}
