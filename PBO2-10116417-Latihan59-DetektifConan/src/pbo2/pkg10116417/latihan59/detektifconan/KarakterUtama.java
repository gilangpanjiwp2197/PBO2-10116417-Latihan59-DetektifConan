/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan59.detektifconan;

/**
 *
 * 
 */
public class KarakterUtama extends Karakter{
    
     private final String tujuan;
    private final String tim;

    public KarakterUtama(String nama, String peran, String tujuan, String tim) {
        super(nama, peran);
        this.tujuan = tujuan;
        this.tim = tim;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getTim() {
        return tim;
    }

    public void tampilKarakterUtama() {
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Peran : " + getPeran());
        System.out.println("Tim : " + getTim());
        System.out.println("Tujuan : " + getTujuan());
        System.out.println("");
    }
    
}
