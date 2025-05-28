public class layananpasien {
    void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("-- Antrian Pasien --");
        Pasien temp = head;
        while (temp != null) {
            System.out.println(temp.nama + "\t" + temp.nik + "\t" + temp.keluhan);
            temp = temp.next;
        }
    }

    public int size() {
        return size;
    }
}
