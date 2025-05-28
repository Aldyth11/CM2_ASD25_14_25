public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan, int biaya) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = biaya;
    }

    public int hitungBiaya() {
        return durasiLayanan * 10000;
    }

    public void tampilkanInformasi() {
        System.out.println("Pasien: " + pasien.nama + ", Dokter: " + dokter.nama + ", Durasi: "
                + durasiLayanan + " menit, Biaya: Rp" + biaya);
    }
}
