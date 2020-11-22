/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan59.detektifconan;

/**
 *
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM KARAKTER DI ANIME DETEKTIF CONAN
 */
public class PBO210116417Latihan59DetektifConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        KarakterUtama conan = new KarakterUtama("Conan Edogawa/Shinichi Kudo", 
                "Detektif", "Memecahkan/Menyelesaikan Kasus ", "Detektif Cilik");
        conan.tampilKarakterUtama();
        
        KarakterUtama ran = new KarakterUtama("Ran Mouri", "Ahli Beladiri Karate", 
                "Ingin Menjadi Ahli Karate di Seluruh Jepang", "Siswi SMA dan Suka pada Shinichi Kudo");
        ran.tampilKarakterUtama();
        
        KarakterUtama kogoro = new KarakterUtama("Kogoro Mouri", "Detektif Swasta", 
                "Memecahkan/Menyelesaikan Kasus", "Detektif Swasta");
        kogoro.tampilKarakterUtama();
        
        KarakterPendukung eri = new KarakterPendukung("Eri Kisaki", "Pengacara", 
                "Istri dari Kogoro Mouri dan Ibunya Ran");
        eri.tampilKarakterPendukung();
        
        KarakterPendukung sonoko = new KarakterPendukung("Sonoko Suzuki", 
                "Siswi SMA", "Sahabatnya Ran Mouri");
        sonoko.tampilKarakterPendukung();
        
        KarakterPendukung heiji = new KarakterPendukung("Heiji Hattori", 
                "Detektif SMA", "Temannya Conan Edogawa");
        heiji.tampilKarakterPendukung();
        
        KarakterPendukung kazuha = new KarakterPendukung("Kazuha Tayoma", 
                "Ahli Aikido", "Temannya Ran Mouri dan Suka pada Heiji Hattori");
        kazuha.tampilKarakterPendukung();
        
        KarakterPendukung agasa = new KarakterPendukung("Hiroshi Agasa", "Profesor",
                "Memberikan bantuan kepada Conan berupa alat dalam memecahkan/menyelesaikan kasus dan kepada Detektif Cilik");
        agasa.tampilKarakterPendukung();
        
         KarakterPendukung ai = new KarakterPendukung("Ai Haibara/Shiho Miyano", "Peneliti/Detektif Cilik",
                "Memberikan bantuan kepada Conan dan salah satu Detektif Cilik");
        ai.tampilKarakterPendukung();
    }
}
   
