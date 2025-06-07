package CaseMethod2.Kendaraan;

public class AntrianKendaraan {
    private NodeKendaraan head;
    private NodeKendaraan tail;

    public void enqueue(Kendaraan kendaraan) {
        NodeKendaraan newNode = new NodeKendaraan(kendaraan);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Kendaraan dequeue(){
        if(head == null) {
            System.out.println("Antrian Kosong");
            return null;
        }
        Kendaraan exit = head.data;
        head = head.next;
        
        if(head != null){
            head.prev = null;
        }else {
            tail = null;
        }
        return exit;
    }

    public void tampilkanAntrian(){
        NodeKendaraan current = head;
        while(current != null){
            current.data.tampilkanInfo();
            current = current.next;
        }
    }

    public int jumlahAntrian() {
        int count = 0;
        NodeKendaraan current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
