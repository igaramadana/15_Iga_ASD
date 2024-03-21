public class InfoMahasiswa15 {
    public double ipk;
    public String nama;
    public int nim;
    public String jk;

    public InfoMahasiswa15() {

    }
    public InfoMahasiswa15(String nama2, int nim2, String jk2, double ipk2) {
        nama = nama2;
        nim = nim2;
        jk = jk2;
        ipk = ipk2;
    }

    public void cetak(int i) {
        System.out.println("Data Mahasiswa ke-" + (i+1));
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("IPK: " + ipk);
    }
}
