import java.util.Scanner;

public class MainFaktorial15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Masukkan jumah elemen yang ingin dihitung: ");
        int elemen = sc15.nextInt();

        Faktorial15[] fk = new Faktorial15[elemen];
        for (int i =0; i < elemen; i++) {
            fk[i] = new Faktorial15();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc15.nextInt();
        }
        System.out.println("===========================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("===========================================");
        System.out.println("Hasil faktorial dengan divide and conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("===========================================");
    }
}
