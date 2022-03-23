/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week07.KantorCabang;

import java.util.Scanner;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class KanCabMain {
    
    public static void main(String[] args) {
        int jumlahPegawai=5;
        Scanner input=new Scanner(System.in);
        
        
        KantorCabang kc=new KantorCabang();
        Pegawai[] pegawai=new Pegawai[kc.MAX_PEGAWAI];
        kc.setPegawai(pegawai, jumlahPegawai);
        for(int i=0;i<jumlahPegawai;i++){
            pegawai[i]=new Pegawai();
            System.out.print("Nama: ");
            pegawai[i].setName(input.next());
            System.out.print("Gaji: ");
            pegawai[i].setGaji(input.nextInt());          
        }
        System.out.println(kc);
    }
}
