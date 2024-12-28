package Praktikum2_Soal3;

// Mengganti nama class ke Pegawai agar sesuai dengan file
public class Pegawai {
    public String nama;
    public String asal; // Perbaikan: Mengubah tipe data dari char ke String
    public String jabatan;
    public int umur = 17; // Menambahkan nilai default umur

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
