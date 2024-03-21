
import java.util.Scanner;

// Class Barang
class Barang {
   private String kode;
   private String nama;
   private double harga;
   private int stok;

   public Barang(String kode, String nama, double harga, int stok) {
       this.kode = kode;
       this.nama = nama;
       this.harga = harga;
       this.stok = stok;
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

// Class TransaksiBarang
class TransaksiBarang {
   private ArrayList<Barang> barangs;
   private ArrayList<Barang> pembelians;

   public TransaksiBarang() {
       barangs = new ArrayList<>();
       pembelians = new ArrayList<>();
   }

   public void tambahBarang(Barang barang) {
       barangs.add(barang);
   }

   public void tampilkanBarang() {
       System.out.println("Daftar Barang:");
       for (Barang barang : barangs) {
           System.out.println("Kode: " + barang.getKode() + ", Nama: " + barang.getNama() + ", Harga: " + barang.getHarga() + ", Stok: " + barang.getStok());
       }
   }

   public void tampilkanPembelian() {
       System.out.println("Daftar Pembelian:");
       for (Barang barang : pembelians) {
           System.out.println("Kode: " + barang.getKode() + ", Nama: " + barang.getNama() + ", Harga: " + barang.getHarga());
       }
   }

   public void melakukanPembelian() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Masukkan kode barang: ");
       String kodeBarang = scanner.nextLine();

       Barang barangPembelian = null;
       for (Barang barang : barangs) {
           if (barang.getKode().equals(kodeBarang)) {
               barangPembelian = barang;
               break;
           }
       }

       if (barangPembelian != null && barangPembelian.getStok() > 0) {
           pembelians.add(barangPembelian);
           barangPembelian.setStok(barangPembelian.getStok() - 1);
           System.out.println("Pembelian berhasil!");
       } else {
           System.out.println("Kode barang tidak valid atau stok habis.");
       }
   }
}

// Class MainBarang
class MainBarang {
   public static void main(String[] args) {
       TransaksiBarang transaksiBarang = new TransaksiBarang();

       // Menambahkan data barang sebelum dibelanjakan
       transaksiBarang.tambahBarang(new Barang("B001", "Buku", 25000, 10));
       transaksiBarang.tambahBarang(new Barang("B002", "Pulpen", 5000, 20));
       transaksiBarang.tambahBarang(new Barang("B003", "Pensil", 3000, 15));
       transaksiBarang.tambahBarang(new Barang("B004", "Penghapus", 2000, 25));
       transaksiBarang.tambahBarang(new Barang("B005", "Penggaris", 8000, 12));

       Scanner scanner = new Scanner(System.in);
       int pilihan;

       do {
           System.out.println("\nMenu Utama:");
           System.out.println("1. Tampilkan Daftar Barang");
           System.out.println("2. Melakukan Pembelian");
           System.out.println("3. Tampilkan Daftar Pembelian");
           System.out.println("0. Keluar");
           System.out.print("Masukkan pilihan: ");
           pilihan = scanner.nextInt();

           switch (pilihan) {
               case 1:
                   transaksiBarang.tampilkanBarang();
                   break;
               case 2:
                   transaksiBarang.melakukanPembelian();
                   break;
               case 3:
                   transaksiBarang.tampilkanPembelian();
                   break;
               case 0:
                   System.out.println("Terima kasih telah menggunakan program ini.");
                   break;
               default:
                   System.out.println("Pilihan tidak valid.");
                   break;
           }
       } while (pilihan != 0);
   }
}