import java.util.Scanner;
public class PersegiPanjangDemo15Modif {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        int panjang, lebar;
        System.out.print("Masukkan jumlah persegi panjang: ");
        int input = sc15.nextInt();
        PersegiPanjang15[] arrayOfPersegiPanjang = new PersegiPanjang15[input];

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            panjang = sc15.nextInt();
            System.out.print("Masukkan Lebar: ");
            lebar = sc15.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang15(panjang, lebar);
            arrayOfPersegiPanjang[i].cetakInfo(i);
            arrayOfPersegiPanjang[i].hitungLuas(i);
            arrayOfPersegiPanjang[i].hitungKeliling(i);
        }
    }
}
