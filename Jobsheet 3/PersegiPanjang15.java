public class PersegiPanjang15 {
    public int panjang;
    public int lebar;
    public int luas;
    public int keliling;

    public PersegiPanjang15(){

    }
    public PersegiPanjang15(int p, int l) {
        panjang = p;
        lebar = l;
    }
    public void hitungLuas(int i) {
        luas = panjang * lebar;
        System.out.println("Luas: " + luas);
    }
    public void hitungKeliling(int i) {
        keliling = 2 * (panjang+lebar);
        System.out.println("Keliling: " + keliling);
    }
public void cetakInfo(int i) {
    System.out.println("Persegi panjang ke-" + (i+1) + " panjang: " + panjang + ", lebar: " + lebar);
    System.out.println("=====================================================================");
    }
}