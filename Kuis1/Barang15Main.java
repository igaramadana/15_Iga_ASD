package Kuis;
import java.util.Scanner;
public class Barang15Main {
    public static void main(String[] args) {
        TransaksiBarang15 transaksiBarang = new TransaksiBarang15();
        Scanner sc15 = new Scanner(System.in);
        int input;

        do{
            System.out.println("==========================");
            System.out.println(" TOKO MAJU MUNDUR CANTIK ");
            System.out.println("==========================");
            System.out.println("1. Tampilkan Barang ");
            System.out.println("2. Beli ");
            System.out.println("3. Tampilkan Pembelian ");
            System.out.println("4. Keluar ");
            System.out.print("Pilih [1-4] : ");
            input = sc15.nextInt();
            sc15.nextLine();

            switch(input){
                case 1 :
                transaksiBarang.tampilkanBarang();
                break;
                case 2 :
                transaksiBarang.melakukanPembelian();
                break;
                case 3 :
                transaksiBarang.tampilkanBarangPembelian();
                break;
                case 4 :
                System.out.println("Terima kasih telah berbelanja!");
                System.exit(0);
                default :
                System.out.println("Pilihan tidak valid!");
            }
        } while (input != 0);
    }
}
