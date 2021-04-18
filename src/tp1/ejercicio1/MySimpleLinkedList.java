package tp1.ejercicio1;

public class MySimpleLinkedList implements Iterable<Integer> {

    protected Node first; // ES EL HEAD DE LAS SLIDES
    protected int size;
    protected Node cursor;

    public MySimpleLinkedList() {
        this.first = null;
        this.size = 0;
    }

    public void insertFront(Integer o) {
        Node tmp = new Node(o,null);      //crea una instancia de clase nodo
        tmp.setNext(this.first);            //setea como proximo nodo al que era primero (first)
        this.first = tmp;                   //first (puntero de la lista) ahora apunta donde estaba tmp
        this.size++;
    }

    // ESTE METODO ELIMINA EL PRIMER ELEMENTO DE LISTA Y NOS RETORNA SU INFO
    public Integer extractFront() {
        if (this.first != null) {//SI HAY ELEMENTOS REMUEVO EL PRIMERO Y RETORNO SU INFO
            Node temp = this.first;
            this.first = first.getNext();
            this.size--;
            return temp.getInfo();
        } else
            return null; //RETORNO NULL PORQUE LA LISTA ESTÁ VACIA
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public int size() {
        /*int count = 0;
        Node cursor = this.first;

        while (cursor != null) {
            cursor = cursor.getNext();
            count++;
        }
        return count;*/
        return size;
    }

    public Integer get(int index) {
        if ((-1 < index) && (index < size)){
            int contador = 0;
            Node cursor = this.first;
            while (contador < index){
                cursor = cursor.getNext();
                contador++;
            }
            return cursor.getInfo();
        } else {
            return null;
        }
    }

    public int indexOf(int num){
        int contador = 0;
        int indice = -1;
        Node cursor = this.first;
        while (contador < size) {
            if (cursor.getInfo() == num) {
                indice = contador;
                break;
            } else {
                cursor = cursor.getNext();
                contador++;
            };
        };
        return indice;
    };

    public void print(int n) {
        // TODO
    }

    @Override
    public MyIterator iterator() {
        return new MyIterator(this.first);
    }

}