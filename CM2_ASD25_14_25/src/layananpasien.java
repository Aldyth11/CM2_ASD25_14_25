public class layananpasien {
    NodeDokter dokterHead, dokterTail;
    NodePasien antrianHead, antrianTail;
    NodePasien riwayatHead, riwayatTail;
    int size = 0;

    public void tambahDokter(Dokter dokter) {
        NodeDokter newNode = new NodeDokter(null, dokter, null);
        if (dokterHead == null) {
            dokterHead = dokterTail = newNode;
        } else {
            dokterTail.next = newNode;
            newNode.prev = dokterTail;
            dokterTail = newNode;
        }
    }

    public Dokter pilihDokter(int index) {
        int i = 0;
        NodeDokter current = dokterHead;
        while (current != null) {
            if (i == index) return current.data;
            i++;
            current = current.next;
        }
        return null;
    }

    public void tambahPasien(Pasien data) {
        NodePasien newNode = new NodePasien(null, data, antrianHead);
        if (antrianHead != null) {
            antrianHead.prev = newNode;
        } else {
            antrianTail = newNode;
        }
        antrianHead = newNode;
        size++;
    }

 
    public void tampilkanDokter() {
        System.out.println("-- Daftar Dokter --");
        int index = 0;
        NodeDokter current = dokterHead;
        while (current != null) {
            System.out.println(index + ". " + current.data.nama);
            current = current.next;
            index++;
        }
    }

    public void tampilkanAntrian() {
        System.out.println("-- Antrian Pasien --");
        NodePasien current = antrianHead;
        while (current != null) {
            System.out.println(current.data.nama + "\t" + current.data.nik + "\t" + current.data.keluhan );
            current = current.next;
        }
    }

    public void layaniPasien() {
        if (antrianTail == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Pasien p = antrianTail.data;
        tambahRiwayat(p);
        if (antrianTail.prev != null) {
            antrianTail = antrianTail.prev;
            antrianTail.next = null;
        } else {
            antrianHead = antrianTail = null;
        }
        size--;
        System.out.println("Pasien " + p.nama + " telah dilayani.");
    }

    public void tambahRiwayat(Pasien p) {
        NodePasien newNode = new NodePasien(null, p, riwayatHead);
        if (riwayatHead != null) {
            riwayatHead.prev = newNode;
        } else {
            riwayatTail = newNode;
        }
        riwayatHead = newNode;
    }

    public void tampilkanRiwayat() {
        System.out.println("-- Riwayat Pasien --");
        NodePasien current = riwayatHead;
        while (current != null) {
            System.out.println(current.data.nama + "\t" + current.data.nik + "\t" + current.data.keluhan);
            current = current.next;
        }
    }

    public void urutkanRiwayat() {
        if (riwayatHead == null || riwayatHead.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            NodePasien current = riwayatHead;
            while (current.next != null) {
                if (current.data.nama.compareTo(current.next.data.nama) > 0) {
                    Pasien temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        System.out.println("Riwayat berhasil diurutkan berdasarkan nama pasien.");
    }

    public int getJumlahPasien() {
        return size;
    }

    public void tampilRiwayat() {
        if (head == null) {
            System.out.println("Antrian riwayat kosong");
            return;
        } else {
            System.out.println("-- Riwayat Transaksi--");
        
    }
}
}
