import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        layananpasien layananpasien = new layananpasien();
        Scanner sc = new Scanner(System.in);

        Dokter dk1 = new Dokter("dr01", "Wike Ratanca");
        Dokter dk2 = new Dokter("dr02", "Santi Runica");
        Dokter dk3 = new Dokter("dr03", "Aam Antanica");
        Dokter dk4 = new Dokter("dr04", "Slamet Sugito");

        while (true) {
            System.out.println("\n== MENU ==");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian");
            System.out.println("5. Riwayat Transaksi");
            System.out.println("6. Sort Transaksi (Nama Pasien Desc)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int Pilihan = sc.nextInt(); 
            sc.nextLine();

            switch (Pilihan) {
        }
    }
    }
}