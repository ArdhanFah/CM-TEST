package CaseMethod2.Kendaraan;

public class NodeKendaraan {
    Kendaraan data;
    NodeKendaraan next;
    NodeKendaraan prev;

    public NodeKendaraan(Kendaraan data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
}
