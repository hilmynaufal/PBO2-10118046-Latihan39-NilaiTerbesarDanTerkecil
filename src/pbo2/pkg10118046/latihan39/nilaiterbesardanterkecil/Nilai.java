/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan39.nilaiterbesardanterkecil;

/**
 *
 * @author ASUS
 */
public class Nilai {
    private String petugas;
    private int terbesar=0, terkecil = 100, jmlNilai;
    private final int nilai[] = new int[100];

    public String getPetugas() {
        return petugas;
    }

    public void setJmlNilai(int jmlNilai) {
        this.jmlNilai = jmlNilai;
    }

    public int getJmlNilai() {
        return jmlNilai;
    }

    public void setNilai(int nilai, int i) {
        this.nilai[i] = nilai;
        terbesar = (nilai>terbesar)?nilai:terbesar;
        terkecil = (nilai<terkecil)?nilai:terkecil;
    }

    public int getNilai(int i) {
        return nilai[i];
    }
    
    
    public void setPetugas(String petugas) {
        this.petugas = petugas;
    }

    public int getTerbesar() {
        return terbesar;
    }


    public int getTerkecil() {
        return terkecil;
    }

    
    
}
