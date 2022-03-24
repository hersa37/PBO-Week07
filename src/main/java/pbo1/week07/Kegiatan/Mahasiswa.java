/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week07.Kegiatan;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Mahasiswa {
    public static final int MAX_KEGIATAN=5;
    
    private String nama;
    private int jumlahKegiatan;
    private Kegiatan[] kegiatan;
    
    public Mahasiswa(String nama){
        this.nama=nama;
        //Array size will always be MAX_KEGIATAN regardless of how many
        //actual kegiatan there is
        kegiatan=new Kegiatan[MAX_KEGIATAN];
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
    /*
    Sets array with size of MAX_KEGIATAN
    jumlahKegiatan stores actual non-null indices
    */
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
        String print="";
        print+="{Nama: "+nama+"; Jumlah Kegiatan: "+jumlahKegiatan;
        for(int i=0;i<jumlahKegiatan;i++){
            print+=kegiatan[i].toString();
        }
        print+="} ";
        return print;
    }
}
