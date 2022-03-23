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
    private static final int MAX_MAHASISWA=100;
    
    public static void main(String[] args) {
        int jumlahKegiatan=5;
        int jumlahMahasiswa=5;
        Scanner input=new Scanner(System.in);
        Mahasiswa[] mhs=new Mahasiswa[MAX_MAHASISWA];
        
        if(jumlahKegiatan>MAX_KEGIATAN) jumlahKegiatan=5;
        
        for(int i=0;i<jumlahMahasiswa;i++){
            System.out.print("Nama Mahasiswa: ");
            String name=input.next();
            mhs[i]=new Mahasiswa(name);
            Kegiatan[] kg=new Kegiatan[MAX_KEGIATAN];
            for(int j=0;j<jumlahKegiatan;j++){
                System.out.print("Nama Kegiatan: ");
                String namaKeg=input.next();
                System.out.print("Point: ");
                try{
                    int point=input.nextInt();
                    kg[j]=new Kegiatan(namaKeg,point);
                } catch(Exception e){
                    kg[j]=new Kegiatan(namaKeg, 0);
                }
            mhs[i].setKegiatan(kg, jumlahKegiatan);
        }        
        }
        
        mhs.toString();
    }
}
