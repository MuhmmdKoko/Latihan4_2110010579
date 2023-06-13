package penilaian;

public class Mahasiswa {
    //membuat variabel
    String nama, npm;
    
    //membuat getter dan setter
    public String getNama() {
        return nama;
    }

    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    
}
