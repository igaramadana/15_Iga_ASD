package Kuis;
public class Barang15 {
    String kode;
    String nama;
    double harga;
    int stok;

    public Barang15() {

    }

    public Barang15(String kode2, String nama2, double harga2, int stok2) {
        kode = kode2;
        nama = nama2;
        harga = harga2;
        stok = stok2;
    }

    public String getKode() {
        return kode;
    }
 
    public String getNama() {
        return nama;
    }
 
    public double getHarga() {
        return harga;
    }
 
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
}
