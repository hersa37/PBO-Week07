/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week07.Kegiatan;

import java.util.Arrays;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Mahasiswa {
    private String nama;
    private int jumlahKegiatan;
    private Kegiatan[] kegiatan;
    
    public Mahasiswa(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public Kegiatan[] getKegiatan(){
        return kegiatan;
    }
    
    public void setKegiatan(Kegiatan[] kegiatan, int jumlahKegiatan){
        this.kegiatan=kegiatan;
        this.jumlahKegiatan=jumlahKegiatan;
    }
    
    public void addKegiatan(Kegiatan kegiatan){
        this.kegiatan[jumlahKegiatan]=kegiatan;
        jumlahKegiatan++;
    }
    
    public void removeKegiatan(int index){
        int last=jumlahKegiatan-1;
        kegiatan[index]=kegiatan[last];
        kegiatan[last]=null;
        jumlahKegiatan--;
    }
    
    public int getJumlahKegiatan(){
        return jumlahKegiatan;
    }
    
    public Kegiatan kegiatanAt(int index){
        return kegiatan[index];
    }
    
    @Override
    public String toString(){
        return "{Nama: "+nama+"; Jumlah Kegiatan: "+jumlahKegiatan
                +"; Kegiatan: "+Arrays.toString(kegiatan)+"} ";
    }
}
