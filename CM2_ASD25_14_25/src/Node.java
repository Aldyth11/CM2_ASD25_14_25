public class Node {
    Pasien data;
    Node prev;
    Node next; 

    Node(Node prev, Pasien data, Node next) {
       this.prev = prev;
       this.data = data;
       this.next = next;
    }
}
