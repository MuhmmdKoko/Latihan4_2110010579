package penilaian;

public class NilaiAkhirBeraksi {
    public static void main(String[] args) {
        //membuat objek
        NilaiAkhir koko = new NilaiAkhir(80,70,90, " Muhammad Koko Saputro", " 2110010579");
                
        //memanggil method hitungNilaiAkhir
        
        
        System.out.println("Nama: "+koko.nama);
        System.out.println("NPM : "+koko.npm);
        System.out.println("Nilai Akhir: "+koko.hitungNilaiAkhir());
    }
}
