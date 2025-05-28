public class Dokter {
    String idDokter;
    String nama;

    public Dokter(String idDokter, String nama) {
    this.idDokter=idDokter;
    this.nama=nama;


}
public void tampilInformasi() {
    System.out.println("Id dokter: " + idDokter + "Nama dokter: " + nama);
}
}
