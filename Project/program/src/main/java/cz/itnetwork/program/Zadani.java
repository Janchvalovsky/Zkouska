/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.program;

import java.util.Scanner;

/**
 *
 * @author janch
 */
public class Zadani {
Scanner sc = new Scanner(System.in);
    public void pridejInfoKlient (Databaze uzivatel){
        System.out.println("Zadejte jméno uživatele: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení uživatele: ");
        String prijmeni = sc.nextLine();
        System.out.println("Zadejte věk uživatele: ");
        int vek = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte telefonní číslo uživatele: ");
        String telefon = sc.nextLine();
        uzivatel.pridejInfoKlient(jmeno, prijmeni, vek, telefon);
    }
    public void vypisInfoKlient (Databaze uzivatel){
        uzivatel.vypisInfoKlient();
    }
    public void vyhledejUzivatele (Databaze uzivatel){
        System.out.println("Zadejte jméno uživatele: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení uživatele: ");
        String prijmeni = sc.nextLine();
        InfoKlient vypis = uzivatel.vyhledejUzivatele(jmeno, prijmeni);
        if (vypis != null){
            System.out.println(vypis.toString());
        }
        else {
            System.out.println("Uživatel nenalezen.");
        }
    }
}
