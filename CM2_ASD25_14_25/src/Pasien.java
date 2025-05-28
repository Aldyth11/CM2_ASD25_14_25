public class Pasien {
    String nama;
    String nik;
    String keluhan;
    Dokter dokter;
    int durasi;
    int total;

    public Pasien(String nama, String nik, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.dokter = null;
        this.durasi = 0;
        this.total = 0;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Pasien: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Keluhan: " + keluhan);
    }
}
