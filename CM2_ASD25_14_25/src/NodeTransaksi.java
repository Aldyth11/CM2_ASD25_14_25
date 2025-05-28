public class NodeTransaksi {
    NodeTransaksi next, prev;
    TransaksiLayanan data;

    public NodeTransaksi(NodeTransaksi prev, TransaksiLayanan data, NodeTransaksi next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
