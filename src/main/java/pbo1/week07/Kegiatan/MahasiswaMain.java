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
    private static final int MAX_MAHASISWA=100;
    //Accessible from static methods
    static Scanner input=new Scanner(System.in);
    static int jumlahMahasiswa=0;
    private static Mahasiswa[] mhs;
    
    public static void main(String[] args) {       
        int jumlahKegiatan=3;        
        mhs=new Mahasiswa[MAX_MAHASISWA];
        
        addMahasiswa(jumlahKegiatan);
              
        System.out.println(mhs[0].toString());
         
 
    }
    
    public static void addMahasiswa(int jumlahKegiatan){
        
        int index=jumlahMahasiswa;
        jumlahMahasiswa++;
        
        System.out.print("Nama: ");
        mhs[index]=new Mahasiswa(input.next());
        
        Kegiatan[] kg=new Kegiatan[Mahasiswa.MAX_KEGIATAN];
        
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
            mhs[index].setKegiatan(kg, jumlahKegiatan);
        }
        
    }
}
