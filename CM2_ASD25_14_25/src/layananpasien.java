public class layananpasien {
    NodeDokter dokterHead, dokterTail;
    NodePasien antrianHead, antrianTail;
    NodePasien riwayatHead, riwayatTail;
    NodeTransaksi trsHead, trsTail;
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

    public Dokter pilihDokter(String idDoker) {
        NodeDokter current = dokterHead;
        while (current != null) {
            if (current.data.idDokter.equalsIgnoreCase(idDoker)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
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
    
    

    public void tambahPasien(Pasien data) {
        NodePasien newNode = new NodePasien(antrianTail, data, null);
        if (antrianHead == null) {
            antrianHead = antrianTail = newNode;
        } else {
            antrianTail.next = newNode;
            newNode.prev = antrianTail;
            antrianTail = newNode;
        }
        size++;
    }

    public void tampilkanDokter() {
        System.out.println("Daftar Dokter Jaga : ");
        System.out.println("Kode\tNama");
        NodeDokter current = dokterHead;
        while (current != null) {
            System.out.println(current.data.idDokter + "\t" + current.data.nama);
            current = current.next;
        }
    }

    public void tampilkanAntrian() {
        System.out.println("-- Antrian Pasien --");
        System.out.println("Nama\tNIK\tKeluhan");
        if (antrianHead == null) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        NodePasien current = antrianHead;
        while (current != null) {
            System.out.println(current.data.nama + "\t" + current.data.nik + "\t" + current.data.keluhan);
            current = current.next;
        }


    public void tampilRiwayat() {
        if (trsHead == null) {
            System.out.println("Riwayat transaksi kosong.");
            return;
        }
    
        NodeTransaksi current = trsHead; 
        System.out.println("-- Riwayat Transaksi --");
        while (current != null) {
            current.data.tampilkanInformasi();
            current = current.next;
        }
    }
    
    public void tambahTransaksi(TransaksiLayanan trx) {
        NodeTransaksi newNode = new NodeTransaksi(null, trx, null);
        if (trsHead == null) {
            trsHead = trsTail = newNode;
        } else {
            trsTail.next = newNode;
            newNode.prev = trsTail;
            trsTail = newNode;
        }
    }    
    
    public void layaniPasien(Dokter dokter, int durasi) {
        if (antrianHead == null) {
            System.out.println("Antrian kosong.");
            return;
        }
    
        Pasien p = antrianHead.data;
        p.dokter = dokter;
        p.durasi = durasi;
        p.total = durasi * 50000;
    
        TransaksiLayanan trx = new TransaksiLayanan(p, dokter, durasi);
        tambahTransaksi(trx);  
        tambahRiwayat(p);
    
        if (antrianHead.next != null) {
            antrianHead = antrianHead.next;
            antrianHead.prev = null;
        } else {
            antrianHead = antrianTail = null;
        }
    
        size--;
        System.out.println("Pasien " + p.nama + " telah dilayani, transaksi berhasil dicatat.");
    }
    

    public void urutkanRiwayat() {
        if (riwayatHead == null || riwayatHead.next == null)
            return;

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

    public int size() {
        return size;
    }

}
