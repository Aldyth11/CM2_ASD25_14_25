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

    public void tambahPasien(String nama, String nik,  String keluhan) {
        Pasien newPasien = new Pasien(nama, nik, keluhan);
        Node newNode = new Node(head, size, head);
        if (isEmpty()) {
            System.out.println("Antrian Pasien Kosong");
        } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        }
        size++;
    }
}
