package tp1.ejercicio1;

import java.util.Iterator;

public class MySimpleLinkedList implements Iterable<Integer> {

    protected Node first; // ES EL HEAD DE LAS SLIDES
    protected int size;
    //protected Node cursor;

    public MySimpleLinkedList() {
        this.first = null;
        this.size = 0;
    }

    public void insertFront(Integer o) {     //Complejidad O(1)
        Node tmp = new Node(o,null);      //crea una instancia de clase nodo
        tmp.setNext(this.first);            //setea como proximo nodo al que era primero (first)
        this.first = tmp;                   //first (puntero de la lista) ahora apunta donde estaba tmp
        this.size++;
    }

    // ESTE METODO ELIMINA EL PRIMER ELEMENTO DE LISTA Y NOS RETORNA SU INFO
    public Integer extractFront() { //Complejidad O(1)
        if (this.first != null) {//SI HAY ELEMENTOS REMUEVO EL PRIMERO Y RETORNO SU INFO
            Node temp = this.first;
            this.first = first.getNext();
            this.size--;
            return temp.getInfo();
        } else
            return null; //RETORNO NULL PORQUE LA LISTA ESTÁ VACIA
    }

    public boolean isEmpty() { //Complejidad O(1)
        return this.first == null;
    }

    public int size() { //Complejidad O(1)
        /*int count = 0;
        Node cursor = this.first;

        while (cursor != null) {
            cursor = cursor.getNext();
            count++;
        }
        return count;*/
        return size;
    }

    public Integer get(int index) { //Complejidad O(n) donde n es el tamaño de la lista;
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

    public Integer getTop() { //Complejidad O(1);
        if (this.first != null) {
            Node temp = this.first;
            this.first = first.getNext();
            return temp.getInfo();
        } else
        return null; //RETORNO NULL PORQUE LA LISTA ESTÁ VACIA
    }

    public int indexOf(int num){ //Complejidad O(n) donde n es el tamaño de la lista;
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

    @Override
    public MyIterator iterator() { //Complejidad O(1)
        return new MyIterator(this.first);
    }

    public void print() { //Complejidad O(n) donde n es el tamaño de la lista;
        MyIterator it = iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " - ");
        }
        System.out.println(" ");
    }


    public MySimpleLinkedList reverse() { //Complejidad O(n) donde n es el tamaño de la lista;
        MySimpleLinkedList listaAuxiliar = new MySimpleLinkedList();
        MyIterator puntero = iterator();
        while (puntero.hasNext()) {
            listaAuxiliar.insertFront(puntero.get());
            puntero.move();
        }
        return listaAuxiliar;
    }

}
