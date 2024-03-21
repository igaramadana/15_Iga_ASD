import java.util.Scanner;
public class InfoMahasiswaMain15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        double ipk;
        System.out.println("Masukkan jumlah Mahasiswa: ");
        int input = sc15.nextInt();
        double totalIpk = 0; 

        InfoMahasiswa15[] arrayInfoMahasiswa15 = new InfoMahasiswa15[input];

        for (int i = 0; i < arrayInfoMahasiswa15.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String nama = sc15.next();
            System.out.print("Masukkan NIM: ");
            int nim = sc15.nextInt();
            System.out.print("Masukkan jenis kelamin (l/p): ");
            String jk = sc15.next();
            System.out.print("Masukkan IPK: ");
            ipk = sc15.nextDouble();

            arrayInfoMahasiswa15[i] = new InfoMahasiswa15(nama, nim, jk, ipk);
            totalIpk += ipk;
        }
        int index = 0;
        for (InfoMahasiswa15 mahasiswa : arrayInfoMahasiswa15) {
            mahasiswa.cetak(index);
            index++;
        }
        if (input != 0) {
            double avgipk = totalIpk/input;
            System.out.println("Rata rata IPK : " + avgipk);
        } else {
            System.out.println("Tidak ada mahasiswa!");
        }
    }
}
