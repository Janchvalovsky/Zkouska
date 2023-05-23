/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.program;

/**
 *
 * @author janch
 */
public class InfoKlient {
private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    public InfoKlient(String jmeno, String prijmeni, int vek, String telefon){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno(){
        return jmeno;
    }
    public void setJmeno (String jmeno){
        this.jmeno = jmeno;
    }
    public String getPrijmeni(){
        return prijmeni;
    }
    public void setPrijmeni (String prijmeni){
        this.prijmeni = prijmeni;
    }
    public int getVek(){
        return vek;
    }
    public void setVek(int vek){
        this.vek = vek;
    }
    public String getTelefon(){
        return telefon;
    }
    public void setTelefon(){
        this.telefon = telefon;
    }

    @Override
    public String toString(){
        return (jmeno + " | " + prijmeni + " | " + vek + " | " + telefon);
    }

}
