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
public class KarakterPendukung extends Karakter {
    
    private final String hubungan;

    public KarakterPendukung(String nama, String peran, String hubungan) {
        super(nama, peran);
        this.hubungan = hubungan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void tampilKarakterPendukung() {
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Peranan sebagai : " + getPeran());
        System.out.println("Hubungan dengan Tokoh Utama : " + getHubungan());
        System.out.println("");
    } 
}
