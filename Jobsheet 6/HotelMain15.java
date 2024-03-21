import java.util.Scanner;

public class HotelMain15 {
    static void menu() {
        Scanner sc15 = new Scanner(System.in);
        HotelService15 list = new HotelService15();
        Hotel15 r1 = new Hotel15("Cendana", "Malang", 300000, (byte)3);
        Hotel15 r2 = new Hotel15("Anggrek", "Bandung", 500000, (byte)4);
        Hotel15 r3 = new Hotel15("Oyo", "Malang", 150000, (byte)2);
        Hotel15 r4 = new Hotel15("Rayz", "Jogja", 700000, (byte)4);
        Hotel15 r5 = new Hotel15("Chakra", "Jakarta", 2000000, (byte)5);

        list.tambah(r1);
        list.tambah(r2);
        list.tambah(r3);
        list.tambah(r4);
        list.tambah(r5);

        System.out.println("Sorting Hotel:");
        System.out.println("1. Data Hotel");
        System.out.println("2. Sorting harga terendah - tertinggi(Bubble Sort)");
        System.out.println("3. Sorting Bintang tertinggi - terendah(Bubble Sort)");
        System.out.println("4. Sorting harga terendah - tertinggi(Selection Sort)");
        System.out.println("5. Sorting Bintang tertinggi - terendah(Selection Sort)");
        System.out.print("Silahkan pilih menu: ");
        int menu = sc15.nextInt();

        switch (menu) {
            case 1:
            System.out.println("Data hotel sebelum sorting");
            list.tampilAll();
            System.out.print("Done? (y/n) : ");
            String pilih = sc15.next();
            if (pilih.equalsIgnoreCase("y")) {
                System.exit(0);
            } else {
                menu();
            }
            case 2:
            System.out.println("Data hotel dari harga termurah");
            list.bubbleSort();
            list.tampilAll();
            System.out.print("Done? (y/n) : ");
            pilih = sc15.next();
            if (pilih.equalsIgnoreCase("y")) {
                System.exit(0);
            } else {
                menu();
            }
            case 3:
            System.out.println("Data hotel dari Bintang tertinggi");
            list.bubbleSortBntg();
            list.tampilAll();
            System.out.print("Done? (y/n) : ");
            pilih = sc15.next();
            if (pilih.equalsIgnoreCase("y")) {
                System.exit(0);
            } else {
                menu();
            }
            case 4:
            System.out.println("Data hotel dari harga termurah");
            list.selectionSort();
            list.tampilAll();
            System.out.print("Done? (y/n) : ");
            pilih = sc15.next();
            if (pilih.equalsIgnoreCase("y")) {
                System.exit(0);
            } else {
                menu();
            }
            case 5:
            System.out.println("Data hotel dari Bintang tertinggi");
            list.selectionSortBntg();
            list.tampilAll();
            System.out.print("Done? (y/n) : ");
            pilih = sc15.next();
            if (pilih.equalsIgnoreCase("y")) {
                System.exit(0);
            } else {
                menu();
            }
            default:
            System.out.println("Input tidak valid!");
            break;
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
