import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        layananpasien layananpasien = new layananpasien();
        Scanner sc = new Scanner(System.in);

        Dokter dk1 = new Dokter("dr01", "Wike Ratanca");
        Dokter dk2 = new Dokter("dr02", "Santi Runica");
        Dokter dk3 = new Dokter("dr03", "Aam Antanica");
        Dokter dk4 = new Dokter("dr04", "Slamet Sugito");

        layananpasien.tambahDokter(dk1);
        layananpasien.tambahDokter(dk2);
        layananpasien.tambahDokter(dk3);
        layananpasien.tambahDokter(dk4);

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
                case 1:
                    System.out.print("Input Nama Pasien : ");
                    String nama = sc.nextLine();
                    System.out.print("NIK : ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan : ");
                    String keluhan = sc.nextLine();
                    Pasien newPasien = new Pasien(nama, nik, keluhan);
                    layananpasien.tambahPasien(newPasien);
                    System.out.println("Pasien masuk ke dalam antrian");
                    break;
                case 2:
                    layananpasien.tampilkanAntrian();
                    break;
            
                case 3:
                    System.out.print("Masukkan ID Dokter: ");
                    String idDokter = sc.nextLine(); 
                    Dokter dokter = layananpasien.pilihDokter(idDokter); 
                    if (dokter == null) {
                        System.out.println("Dokter tidak ditemukan!");
                        break;
                    }

                    System.out.print("Masukkan durasi layanan (Jam): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    layananpasien.layaniPasien(dokter, durasi); 
                    break;

                case 4:
                    System.out.println("Total antrian sekarang: " + layananpasien.size());
                    break;
                case 5:
                    layananpasien.tampilRiwayat();
                    break;
                case 6:
                    layananpasien.urutkanRiwayat();
                    break;
                case 0:
                    System.out.println("Keluar dari program, Terima kasih");
            }
        }
    }
}