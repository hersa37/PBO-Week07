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
    
    private String kodeCabang;
    private Pegawai pimpinan;
    private Pegawai[] pegawai;
    private int jumlahPegawai;
           
    public KantorCabang(){
        this("",new Pegawai());
    }
    
    public KantorCabang(String kode, Pegawai pimpinan){
        kodeCabang=kode;
        if(pimpinan.getJabatan().equals("pimpinan")){
            this.pimpinan=pimpinan;
        } else this.pimpinan=new Pegawai();
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
        if(pimpinan.getJabatan().equals("pimpinan")){
            this.pimpinan = pimpinan;
        } else this.pimpinan = new Pegawai();
    }

    public Pegawai[] getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai[] pegawai, int jumlahPegawai) {
        this.pegawai = pegawai;
        this.jumlahPegawai=jumlahPegawai;
    }
    
    public int getJumlahPegawai(){
        return jumlahPegawai;
    }
    
    @Override
    public String toString(){
        return "{Kode Cabang: "+kodeCabang
                +"; Pimpinan: "+pimpinan.toString();
    }
    
    
}
