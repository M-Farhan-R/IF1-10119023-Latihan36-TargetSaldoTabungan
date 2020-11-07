/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan36.targetsaldotabungan;

/**
 *
 * @author Muhammad Farhan R 
 */
import java.text.DecimalFormat;
public class Tabungan {
    public int saldoAwal;
    public int bungaBulan;
    private int bungaSaldo;
    
    private void hitungSaldoPerbulan(){
        bungaSaldo = saldoAwal*bungaBulan/100;
        saldoAwal = saldoAwal + bungaSaldo;
    }
    
    public int targetTabungan(int target){
        DecimalFormat titik = new DecimalFormat("#,###");
        
        for(int i = 1;saldoAwal<target;i++){
            hitungSaldoPerbulan();
            System.out.println("Saldo di bulan ke-"+i+" Rp."+titik.format(saldoAwal));
        }
        return bungaSaldo;
    }
}
