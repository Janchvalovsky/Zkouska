/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.program;

import java.util.Scanner;
/**
 *
 * @author janch
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Databaze databaze = new Databaze();
        Zadani uzivatel = new Zadani();
        String volba = "";
        while (!volba.equals ("4")){
            System.out.println("------------------------------");
            System.out.println("Evidence uživatelů (pojištěných)");
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("Možnosti: ");
            System.out.println("1) Přidat nového uživatele");
            System.out.println("2) Vypsat všechny uživatele");
            System.out.println("3) Vyhledat uživatele");
            System.out.println("4) Ukončit");
            volba = sc.nextLine();
            System.out.println();
            switch (volba){                
                case "1" -> {
                    uzivatel.pridejInfoKlient(databaze);
                    System.out.println();
                }
                case "2" -> {
                    uzivatel.vypisInfoKlient(databaze);
                    System.out.println();
                }
                case "3" -> {
                    uzivatel.vyhledejUzivatele(databaze);
                    System.out.println();
                }
                case "4" -> System.out.println("Děkuji za využití programu.");
                default -> System.out.println("Neplatná možnost, prosím znovu.");
            }
        }
    }
}

