public class BukuMain15 {
    public static void main(String[] args) {
        Buku15 bk15 = new Buku15();
        bk15.judul = "Today Ends Tomorrow Comes";
        bk15.pengarang = "Denanda Pratiwi";
        bk15.halaman = 198;
        bk15.stok = 13;
        bk15.harga = 71000;

        bk15.tampilInformasi();
        bk15.terjual(5);
        bk15.gantiHarga(60000);
        bk15.tampilInformasi();
        int jumlahBukuTerjual = 5;
        double hargaFinal = bk15.finalHarga(jumlahBukuTerjual);
        System.out.println("Harga setelah diskon: Rp. " + hargaFinal);
    }
}