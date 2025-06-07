package CaseMethod2.Menu;

import java.util.Scanner;

import CaseMethod2.BBM.BBM;
import CaseMethod2.Kendaraan.AntrianKendaraan;
import CaseMethod2.Kendaraan.Kendaraan;

public class Tambahkan {
    private Scanner scanner = new Scanner(System.in);
    Kendaraan kendaraan = inputKendaraan(scanner);
    AntrianKendaraan antrianKendaraan;

    public Tambahkan(AntrianKendaraan antrianKendaraan) {
        this.antrianKendaraan = antrianKendaraan;
    }

    private static Kendaraan inputKendaraan(Scanner scanner) {
        System.out.print("Masukkan Plat Nomor:  ");
        String plat = scanner.nextLine();
        System.out.print("Masukkan Jenis Kendaraan: ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan Merk Kendaraan: ");
        String merk = scanner.nextLine();
        return new Kendaraan(plat, jenis, merk);
    }


    public void tambahKendaraan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Tambah Kendaraan ===");
        System.out.println("1. Tambah Kendaraan");
        System.out.println("2. Tambah Kendaraan Awal");
        System.out.println("3. Tambah by Index");
        System.out.print("Pilih opsi: ");
        int opsi = scanner.nextInt(); scanner.nextLine(); // Clear the newline character

        switch (opsi) {
            case 1:
                kendaraan = inputKendaraan(scanner);
                antrianKendaraan.enqueue(kendaraan);
                System.out.println("Kendaraan berhasil ditambahkan ke antrian.");
                break;
            case 2:
                kendaraan = inputKendaraan(scanner);
                antrianKendaraan.addFirst(kendaraan);
                System.out.println("Kendaraan berhasil ditambahkan di awal antrian.");
                break;
            case 3:
                kendaraan = inputKendaraan(scanner);
                System.out.print("Masukkan index untuk menambahkan kendaraan: ");
                int index = scanner.nextInt(); scanner.nextLine(); // Clear the newline character
                antrianKendaraan.addByIndex(kendaraan, index);
                System.out.println("Kendaraan berhasil ditambahkan di index tertentu.");
                break;
        
            default:
                break;
        }
        
       
    }
}
