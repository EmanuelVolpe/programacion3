package tp1.ejercicio1;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

    protected Node cursor;

    public MyIterator(Node node) {
        this.cursor = node;
    }

    @Override
    public boolean hasNext() {
        return this.cursor != null;
    }

    @Override
    //ENTREGA EL VALOR DEL CURSOR Y DEJA PARADO EL CURSOR EN EL NODO SIGUIENTE
    public Integer next() {
        Integer info = this.cursor.getInfo();
        this.cursor = this.cursor.getNext();
        return info;
    }

    /* Metodos adicionales que podemos agregar si queremos */

    public Integer get() {
        return this.cursor.getInfo();
    }

    public void move() {
        this.cursor = this.cursor.getNext();
    }

}

