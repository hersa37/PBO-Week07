/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week07.KantorCabang;


/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class KantorCabang {
    public final int MAX_PEGAWAI=100; //Constant owned by KantorCabang
    
    private String kodeCabang;
    private Pegawai pimpinan;
    private Pegawai[] pegawai; //Array of Pegawai objects
    private int jumlahPegawai;
    
    /*
    *Default constructor that calls constructor with corresponding parameters
    */
    public KantorCabang(){
        this("",new Pegawai()); 
        
    }
    /*
    Constructor with KanCab kode and pimpinan
    */    
    public KantorCabang(String kode, Pegawai pimpinan){
        kodeCabang=kode;
        if(pimpinan.getJabatan().equals("pimpinan")){
            this.pimpinan=pimpinan;
        } else this.pimpinan=new Pegawai();
        pegawai=new Pegawai[MAX_PEGAWAI]; //Assigns array with the size of MAX_PEGAWAI
    }   

    public String getKodeCabang() {
        return kodeCabang;
    }

    public void setKodeCabang(String kodeCabang) {
        this.kodeCabang = kodeCabang;
    }

    public Pegawai getPimpinan() {
        return pimpinan;
    }

    public void setPimpinan(Pegawai pimpinan) {
        //Checks if pegawai is pimpinan. Creates default Pegawai if check fails
        if(pimpinan.getJabatan().equals("pimpinan")){ 
            this.pimpinan = pimpinan;
        } else this.pimpinan = new Pegawai();
    }

    public Pegawai[] getPegawai() {
        return pegawai;
    }
    /*
    sets array of pegawai and sets jumlahpegawai to actual number of pegawai
    Array size stays at MAX_PEGAWAI
    */
    public void setPegawai(Pegawai[] pegawai, int jumlahPegawai) {
        this.pegawai = pegawai;
        this.jumlahPegawai=jumlahPegawai;
    }
    
    /*
    Adds pegawai at index of after last non-null index.
    Last non-null index is at jumlahPegawai-1.
    Updates jumlahPegawai to new value
    */
    public void addPegawai(Pegawai pegawai){
        this.pegawai[jumlahPegawai]=pegawai;
        jumlahPegawai++;
    }
    
    /*
    Removes object at index by replacing it with last non-null index
    Turns last non-null index to null and updates jumlahPegawai value
    */
    public void removePegawai(int index){
        pegawai[index]=pegawai[jumlahPegawai-1];
        pegawai[jumlahPegawai-1]=null;
        jumlahPegawai--;        
    }
    
    public int getJumlahPegawai(){
        return jumlahPegawai;
    }
    
    @Override
    public String toString(){
        String print="{";
        for(int i=0;i<jumlahPegawai;i++){
            print+="Pegawai: "+pegawai[i].getName()
                    +"; Gaji: "+pegawai[i].getGaji()+"\n";
        }
        print+="} ";
        return print;
    }
    
    
}
