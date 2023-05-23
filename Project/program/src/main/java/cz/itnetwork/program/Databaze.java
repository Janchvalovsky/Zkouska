/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.program;

import java.util.ArrayList;
/**
 *
 * @author janch
 */
public class Databaze {
    public ArrayList<InfoKlient> uzivatel = new ArrayList<>();

    public void pridejInfoKlient(String jmeno, String prijmeni, int vek, String telefon) {
        uzivatel.add(new InfoKlient(jmeno, prijmeni, vek, telefon));
        System.out.println("Uživatel přidán.");
    }

    public void vypisInfoKlient() {
        for (int i = 0; i < uzivatel.size(); i++)
            System.out.println(uzivatel.get(i).toString());
    }

    
    public InfoKlient vyhledejUzivatele (String jmeno, String prijmeni){
        InfoKlient vystup = null;
        for (int i = 0; i < uzivatel.size(); i++) {
            if (uzivatel.get(i).getJmeno().equals(jmeno) && uzivatel.get(i).getPrijmeni().equals(prijmeni)) {
                vystup = uzivatel.get(i);
            }
        }
        return vystup;
    }
}

