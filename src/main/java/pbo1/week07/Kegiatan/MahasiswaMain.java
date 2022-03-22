/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week07.Kegiatan;

import java.util.Scanner;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class MahasiswaMain {
    private static final int MAX_KEGIATAN=5;
    
    public static void main(String[] args) {
        int jumlahKegiatan=5;
        Scanner input=new Scanner(System.in);
        Mahasiswa mhs=new Mahasiswa("Echa");
        Kegiatan[] kg=new Kegiatan[MAX_KEGIATAN];
        if(jumlahKegiatan>MAX_KEGIATAN) jumlahKegiatan=5;
        mhs.setKegiatan(kg, jumlahKegiatan);
        
       
        for(int i=0;i<jumlahKegiatan;i++){
            System.out.print("Nama Kegiatan: ");
            String namaKeg=input.next();
            System.out.print("Point: ");
            try{
                int point=input.nextInt();
                kg[i]=new Kegiatan(namaKeg,point);
            } catch(Exception e){
                kg[i]=new Kegiatan(namaKeg, 0);
            }
        }        
        mhs.toString();
    }
}
