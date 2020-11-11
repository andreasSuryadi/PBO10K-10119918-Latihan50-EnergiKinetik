/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan50energikinetik;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitungan energi kinetik
 *
 */

public class PBO10K10119918Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnergiKinetik energiKinetik = new EnergiKinetik(0.145, 25);
        
        double kinetik = energiKinetik.hitungEnergiKinetik(energiKinetik.getMassa(), energiKinetik.getKecepatan());
        
        System.out.println("Massa \t\t\t : " + energiKinetik.getMassa() + " kg");
        System.out.println("Kecepatan \t\t : " + energiKinetik.getKecepatan() + " m/s");
        System.out.printf("Energi Kinetik \t\t : %.4f J%n", kinetik);
        System.out.printf("Usaha Saat Diam \t : %.4f J%n", energiKinetik.usahaKetikaDiam(kinetik));
    }
    
}
