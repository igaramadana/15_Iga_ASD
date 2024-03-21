/**
 * Buku15
 */
public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga, totalHarga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok Kosong!");
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    int hitungHargaTotal(int jml) {
        return harga * jml;
    }
    double hitungDiskon(double hitungHargaTotal) {
        if (totalHarga > 150000) {
            return 0.15 * totalHarga;
        } else if (totalHarga >= 75000 && totalHarga <= 150000) {
            return 0.05 * totalHarga;
        } else {
            return 0;
        } 
    }
    double finalHarga(int jml) {
        double totalHarga = hitungHargaTotal(jml);
        double diskon = hitungDiskon(jml);
        return totalHarga - diskon;
    }
}