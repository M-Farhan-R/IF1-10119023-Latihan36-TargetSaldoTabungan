/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan36.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program menghitung berapa bulan yang diperlukan untuk
 *                      mencapai target tabungan yang diinput
 *
 */
import java.util.Scanner;
public class IF110119023Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan t = new Tabungan();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        System.out.print("Saldo Awal\t : Rp.");
        t.saldoAwal = scan.nextInt();
        System.out.print("Bunga/Bulan\t : ");
        t.bungaBulan = scan1.nextInt();
        System.out.print("Saldo Target\t : Rp.");
        int target = scan2.nextInt();
        
        t.targetTabungan(target);
    }

}
