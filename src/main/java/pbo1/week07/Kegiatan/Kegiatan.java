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
public class Kegiatan {
    private String namaKeg;
    private int point;
    
    public Kegiatan(String namaKeg, int point){
        this.namaKeg=namaKeg;
        this.point=point;
    }

    public String getNamaKeg() {
        return namaKeg;
    }

    public void setNamaKeg(String namaKeg) {
        this.namaKeg = namaKeg;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    @Override
    public String toString(){
        return "{NamaKeg: "+namaKeg+"; Point: "+point+"} ";
    }
}
