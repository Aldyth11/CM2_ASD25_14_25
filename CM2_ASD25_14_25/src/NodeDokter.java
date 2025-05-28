public class NodeDokter {
    Dokter data;
    NodeDokter prev, next;

    public NodeDokter(NodeDokter prev, Dokter data, NodeDokter next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    
}