/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menentukan nilai terbesar dan terkecil dari nilai yang dimasukkan dengan konsep pbo
 */
public class PBO210118046Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        
        System.out.println("======Program Nilai Terbesar Dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukkan nama petugas: ");
        Scanner scanner = new Scanner(System.in);
        nilai.setPetugas(scanner.next());
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        nilai.setJmlNilai(scanner.nextInt());
        for (int i = 1; i <=nilai.getJmlNilai(); i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " = ");
            nilai.setNilai(scanner.nextInt(), i);
        }
        
        System.out.println("\n======Hasil Nilai Mahasiswa======");
        for (int i = 1;i >= nilai.getJmlNilai(); i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai.getNilai(i));            
        }
        System.out.println("Nilai Terbesar adalah " + nilai.getTerbesar());
        System.out.println("Nilai Terkecil adalah " + nilai.getTerkecil());
        System.out.println("\nPetugas: " + nilai.getPetugas());
        
    }

}
