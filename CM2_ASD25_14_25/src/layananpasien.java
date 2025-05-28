public class layananpasien {
    Node head;
    Node tail;
    int size;

    public layananpasien() {
        this.head = null;
        this.size = 0;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPasien(Pasien data) {
        if (head == null) {
            head = tail = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
      
    void tampilkanAntrian() {
    if (head == null) {
        System.out.println("Antrian kosong.");
        return;
    }
    System.out.println("-- Antrian Pasien --");
    Node temp = head;  
    while (temp != null) {
        System.out.println(temp.data.nama + "\t" + temp.data.nik + "\t" + temp.data.keluhan);
        temp = temp.next;
    }
}

    public int size() {
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
