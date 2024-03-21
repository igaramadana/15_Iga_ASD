public class PersegiPanjangDemo15 {
    public static void main(String[] args) {
        PersegiPanjang15[] arrayPersegiPanjang = new PersegiPanjang15[3];
        arrayPersegiPanjang[0] = new PersegiPanjang15();
        arrayPersegiPanjang[0].panjang = 110;
        arrayPersegiPanjang[0].lebar = 30;

        arrayPersegiPanjang[1] = new PersegiPanjang15();
        arrayPersegiPanjang[1].panjang = 80;
        arrayPersegiPanjang[1].lebar = 40;

        arrayPersegiPanjang[2] = new PersegiPanjang15();
        arrayPersegiPanjang[2].panjang = 100;
        arrayPersegiPanjang[2].lebar = 20;

        System.out.println("Persegi panjang ke-1, panjang: " + arrayPersegiPanjang[0].panjang + ", lebar: " + arrayPersegiPanjang[0].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " + arrayPersegiPanjang[1].panjang + ", lebar: " + arrayPersegiPanjang[1].lebar);
        System.out.println("Persegi panjang ke-3, panjang: " + arrayPersegiPanjang[2].panjang + ", lebar: " + arrayPersegiPanjang[2].lebar);
    }
}
