package tp_securite_algo_chiffrement;

import java.util.Scanner;

/**
 *
 * @author MILD
 */
public class Tp_securite_Algo_chiffrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Insertion de N de 8 bits 
        int tab1[] = new int[8];
        Scanner milolo = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("saisissez le bit de position " + i + ":");
            tab1[i] = milolo.nextInt();
        }
        //Affichage des données de la clé N 
        System.out.print("N = ");
        for (int i = 0; i < 8; i++) {
            System.out.print(tab1[i] + "|");
        }
        System.out.println("");

        // Appliquer la permutation π 
        System.out.println("----------------------------");
        int pi[] = new int[8];
        for (int w = 0; w < 8; w++) {
            System.out.print("valeur de permutation position " + w + ":");
            pi[w] = milolo.nextInt();
        }
        //Affichage de la permutation 
        System.out.print(" π = ");
        for (int w = 0; w < 8; w++) {
            System.out.print(pi[w] + "|");
        }
        System.out.println("");
        System.out.println("----------------------------");
        System.out.print("π (N) = ");
        System.out.print(tab1[4] + "|" + tab1[6] + "|" + tab1[0] + "|" + tab1[2] + "|" + tab1[7] + "|" + tab1[3] + "|" + tab1[1] + "|" + tab1[5]);
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("On sait que N = GO || DO de taille 4");
        System.out.print("GO = ");
        System.out.println(tab1[4] + "|" + tab1[6] + "|" + tab1[0] + "|" + tab1[2]);
        System.out.println("");
        System.out.print("DO = ");
        System.out.println(tab1[7] + "|" + tab1[3] + "|" + tab1[1] + "|" + tab1[5]);
        System.out.println("----------------------------");
        System.out.println("1er Round : D1 = P(GO) ⊕ K1 , On sait que P = 2013");
        System.out.print("P (GO) = ");
        System.out.println(tab1[0] + "|" + tab1[4] + "|" + tab1[6] + "|" + tab1[2]);
        System.out.println("");
        System.out.print("K1 = ");
        System.out.println(tab1[2] + "|" + tab1[4] + "|" + tab1[6] + "|" + tab1[0]);
        System.out.println("");
        System.out.print("D1 = P(GO) ⊕ K1 = ");
        if (tab1[0] == tab1[2]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tab1[4] == tab1[4]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tab1[6] == tab1[6]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tab1[2] == tab1[0]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        System.out.println("");
        System.out.println("----------------------------");
        //Affichage G1
        System.out.println("G1 = D0 ⊕(G0 ∨k1) ");
        System.out.print("On sait déjà que DO = ");
        System.out.println(tab1[7] + "|" + tab1[3] + "|" + tab1[1] + "|" + tab1[5]);
        System.out.print("On sait également que GO = ");
        System.out.println(tab1[4] + "|" + tab1[6] + "|" + tab1[0] + "|" + tab1[2]);
        System.out.print("Puis k1 = ");
        System.out.println(tab1[2] + "|" + tab1[4] + "|" + tab1[6] + "|" + tab1[0]);
        System.out.println("");
        System.out.print("Y = G0 ∨k1 = ");
        if (tab1[4] == 1 && tab1[2] == 1) {
            System.out.print(1 + "|");
        } else if ((tab1[4] == 1 && tab1[2] == 0) || (tab1[4] == 0 && tab1[2] == 1)) {
            System.out.print(1 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tab1[6] == 1 && tab1[4] == 1) {
            System.out.print(1 + "|");
        } else if ((tab1[6] == 1 && tab1[4] == 0) || (tab1[6] == 0 && tab1[4] == 1)) {
            System.out.print(1 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tab1[0] == 1 && tab1[6] == 1) {
            System.out.print(1 + "|");
        } else if ((tab1[0] == 1 && tab1[6] == 0) || (tab1[0] == 0 && tab1[6] == 1)) {
            System.out.print(1 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tab1[2] == 1 && tab1[0] == 1) {
            System.out.print(1 + "|");
        } else if ((tab1[2] == 1 && tab1[0] == 0) || (tab1[2] == 0 && tab1[0] == 1)) {
            System.out.print(1 + "|");
        } else {
            System.out.print(0 + "|");
        }
        System.out.println("");
        System.out.println("----------------------------");
        System.out.print("G1 = D0 ⊕ Y = ");
        if ((tab1[1] == 0 && tab1[7] == 0) || (tab1[1] == 1 && tab1[7] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tab1[2] == 0 && tab1[3] == 0) || (tab1[2] == 1 && tab1[3] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tab1[4] == 0 && tab1[1] == 0) || (tab1[4] == 1 && tab1[1] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tab1[2] == 0 && tab1[5] == 0) || (tab1[2] == 1 && tab1[5] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }

        System.out.println("");
        System.out.println("============================");
        System.out.println("2ème Round");
        System.out.println("D2 = P(G1)⊕k2");
        System.out.print("Or on sait que G1 = ");
        if ((tab1[1] == 0 && tab1[7] == 0) || (tab1[1] == 1 && tab1[7] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tab1[2] == 0 && tab1[3] == 0) || (tab1[2] == 1 && tab1[3] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tab1[4] == 0 && tab1[1] == 0) || (tab1[4] == 1 && tab1[1] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tab1[2] == 0 && tab1[5] == 0) || (tab1[2] == 1 && tab1[5] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        System.out.println("");
        System.out.print("D'où k2 = ");
        System.out.println(tab1[7] + "|" + tab1[3] + "|" + tab1[1] + "|" + tab1[5]);
        System.out.println("");
        System.out.print("P(G1) = ");
        System.out.println(tab1[3] + "|" + tab1[1] + "|" + tab1[2] + "|" + tab1[7]);
        System.out.print("D2 = P(G1)⊕k2 = ");
        if ((tab1[7] == 0 && tab1[3] == 0) || (tab1[7] == 1 && tab1[3] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tab1[3] == 0 && tab1[1] == 0) || (tab1[3] == 1 && tab1[1] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tab1[1] == 0 && tab1[2] == 0) || (tab1[1] == 1 && tab1[2] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tab1[2] == 0 && tab1[7] == 0) || (tab1[2] == 1 && tab1[7] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        System.out.println("");
    }

}
