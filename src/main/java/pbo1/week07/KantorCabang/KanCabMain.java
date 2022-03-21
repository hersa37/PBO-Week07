/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week07.KantorCabang;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class KanCabMain {
    private static final int MAX_PEGAWAI=100;
    
    public static void main(String[] args) {
        int jumlahPegawai=5;
        Scanner input=new Scanner(System.in);
        Pegawai[] pegawai=new Pegawai[MAX_PEGAWAI];
        
        KantorCabang kc=new KantorCabang("B001", new Pegawai("echa","b001","pimpinan"));
        kc.setPegawai(pegawai, jumlahPegawai);
        for(int i=0;i<jumlahPegawai;i++){
            pegawai[i]=new Pegawai();
            System.out.print("Nama: ");
            pegawai[i].setName(input.next());
            System.out.print("Jabatan: ");
            pegawai[i].setJabatan(input.next());
            System.out.print("Gaji: ");
            pegawai[i].setGaji(input.nextInt());
            System.out.println("Ulang Tahun: ");
            System.out.println("day: ");
            int day=input.nextInt();
            System.out.println("month: ");
            int month=input.nextInt();
            System.out.println("year: ");
            int year=input.nextInt();
            pegawai[i].setBirthday(LocalDate.of(year, month, day));
            
        }
        for(int i=0;i<jumlahPegawai;i++){
            System.out.println(pegawai[i]);
        }
    }
}
