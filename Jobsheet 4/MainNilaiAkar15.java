import java.util.Scanner;
public class MainNilaiAkar15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("\t\t\t\t\tNILAI AKAR PANGKAT");
        System.out.println("=======================================================");
        System.out.print("Masukkan jumlah bilangan yang ingin dihitung akarnya: ");
        int jumlahBilangan = sc.nextInt();

        NilaiAkar15[] akar = new NilaiAkar15[jumlahBilangan];
        for (int i = 0; i < jumlahBilangan; i++) {
            akar[i] = new NilaiAkar15();
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            akar[i].nilai = sc.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Brute Force");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akar[i].nilai + " adalah: " + akar[i].akarPangkatDuaBF(akar[i].nilai));
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Divide and Conquer");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akar[i].nilai + " adalah: " + akar[i].akarPangkatDuaDC(akar[i].nilai, 0, akar[i].nilai));
        }
        System.out.println("=======================================================");
    }
}