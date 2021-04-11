package tp1.ejercicio1;

public class MySimpleLinkedList implements Iterable<Integer> {

    private Node first;

    public MySimpleLinkedList() {
        this.first = null;
    }

    public void insertFront(Integer o) {
        Node tmp = new Node(o,null);      //crea una instancia de clase nodo
        tmp.setNext(this.first);            //setea como proximo nodo al que era primero (first)
        this.first = tmp;                   //first (puntero de la lista) ahora apunta donde estaba tmp
    }

    public Integer extractFront() {
        if (this.first != null) {
            Node temp = this.first;
            this.first = first.getNext();
            return temp.getInfo();

        } else
            return null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public int size() {
        int count = 0;
        Node pointer = this.first;

        while (pointer != null) {
            pointer = pointer.getNext();
            count++;
        }
        return count;
    }

    public Integer get(int index) {
        // TODO
        return null;
    }

    public void print(int n) {
        // TODO
    }

    @Override
    public MyIterator iterator() {
        return new MyIterator(this.first);
    }

}
