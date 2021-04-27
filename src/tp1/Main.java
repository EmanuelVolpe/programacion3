package tp1;

import tp1.ejercicio1.MyIterator;
import tp1.ejercicio1.MySimpleLinkedList;

public class Main {

    public static MySimpleLinkedList listaPedida(MySimpleLinkedList listaDeEntrada, int umbral) { //Complejidad O(n) donde n es el tamaño de la lista;

        MySimpleLinkedList listaAuxiliar = new MySimpleLinkedList();
        MyIterator iteradorEntrada = listaDeEntrada.iterator();
        int suma = 0;
        while (iteradorEntrada.hasNext()) {
            suma = suma + iteradorEntrada.get();
            if ((suma <= umbral) && (listaAuxiliar.isEmpty())) {
                listaAuxiliar.insertFront(suma);
            }
            if((suma <= umbral) && (!listaAuxiliar.isEmpty())){
                listaAuxiliar.extractFront();
                listaAuxiliar.insertFront(suma);
            } else {
                if(iteradorEntrada.get() <= umbral) {
                    listaAuxiliar.insertFront(iteradorEntrada.get());
                }
                suma = iteradorEntrada.get();
            }
            iteradorEntrada.move();
        }
        return listaAuxiliar.reverse();
    }

    public static void main(String[] args) {

        MySimpleLinkedList listaDeSalida1;
        MySimpleLinkedList listaDeSalida2;
        MySimpleLinkedList listaDeSalida3;
        MySimpleLinkedList listaDeSalida4;
        MySimpleLinkedList listaDeSalida5;
        MySimpleLinkedList listaDeSalida6;


        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println("Ejercicio Nª 1");
        MySimpleLinkedList listaDeEntrada1 = new MySimpleLinkedList();
        // NO SE AGREGAN ELEMENTOS A LA LISTA

        System.out.println("Tamaño de la lista de Entrada: " + listaDeEntrada1.size());
        System.out.println("Lista de Entrada");
        listaDeEntrada1.print();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        listaDeSalida1 = listaPedida(listaDeEntrada1,10);
        System.out.println("Tamaño de la lista de Salida: " + listaDeSalida1.size());
        System.out.println("Lista de Salida");
        listaDeSalida1.print();
        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //---------------------------------------------------------------------------------------------

        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println("Ejercicio Nª 2");
        MySimpleLinkedList listaDeEntrada2 = new MySimpleLinkedList();
        listaDeEntrada2.insertFront(3);
        listaDeEntrada2.insertFront(2);
        listaDeEntrada2.insertFront(1);

        System.out.println("Tamaño de la lista de Entrada: " + listaDeEntrada2.size());
        System.out.println("Lista de Entrada");
        listaDeEntrada2.print();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        listaDeSalida2 = listaPedida(listaDeEntrada2,10);
        System.out.println("Tamaño de la lista de Salida: " + listaDeSalida2.size());
        System.out.println("Lista de Salida");
        listaDeSalida2.print();
        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //---------------------------------------------------------------------------------------------

        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println("Ejercicio Nª 3");
        MySimpleLinkedList listaDeEntrada3 = new MySimpleLinkedList();
        listaDeEntrada3.insertFront(3);
        listaDeEntrada3.insertFront(2);
        listaDeEntrada3.insertFront(1);

        System.out.println("Tamaño de la lista de Entrada: " + listaDeEntrada3.size());
        System.out.println("Lista de Entrada");
        listaDeEntrada3.print();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        listaDeSalida3 = listaPedida(listaDeEntrada3,2);
        System.out.println("Tamaño de la lista de Salida: " + listaDeSalida3.size());
        System.out.println("Lista de Salida");
        listaDeSalida3.print();
        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //----------------------------------------------------------------------------------------------

        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println("Ejercicio Nª 4");
        MySimpleLinkedList listaDeEntrada4 = new MySimpleLinkedList();
        listaDeEntrada4.insertFront(28);
        listaDeEntrada4.insertFront(14);
        listaDeEntrada4.insertFront(19);
        listaDeEntrada4.insertFront(7);
        listaDeEntrada4.insertFront(2);
        listaDeEntrada4.insertFront(5);
        listaDeEntrada4.insertFront(3);

        System.out.println("Tamaño de la lista de Entrada: " + listaDeEntrada4.size());
        System.out.println("Lista de Entrada");
        listaDeEntrada4.print();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        listaDeSalida4 = listaPedida(listaDeEntrada4,10);
        System.out.println("Tamaño de la lista de Salida: " + listaDeSalida4.size());
        System.out.println("Lista de Salida");
        listaDeSalida4.print();
        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //----------------------------------------------------------------------------------------------

        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println("Ejercicio Nª 5");
        MySimpleLinkedList listaDeEntrada5 = new MySimpleLinkedList();
        listaDeEntrada5.insertFront(28);
        listaDeEntrada5.insertFront(14);
        listaDeEntrada5.insertFront(15);
        listaDeEntrada5.insertFront(7);
        listaDeEntrada5.insertFront(2);
        listaDeEntrada5.insertFront(4);
        listaDeEntrada5.insertFront(5);
        listaDeEntrada5.insertFront(3);

        System.out.println("Tamaño de la lista de Entrada: " + listaDeEntrada5.size());
        System.out.println("Lista de Entrada");
        listaDeEntrada5.print();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        listaDeSalida5 = listaPedida(listaDeEntrada5,15);
        System.out.println("Tamaño de la lista de Salida: " + listaDeSalida5.size());
        System.out.println("Lista de Salida");
        listaDeSalida5.print();
        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //----------------------------------------------------------------------------------------------

        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println("Ejercicio Nª 6");
        MySimpleLinkedList listaDeEntrada6 = new MySimpleLinkedList();
        listaDeEntrada6.insertFront(3);
        listaDeEntrada6.insertFront(28);
        listaDeEntrada6.insertFront(14);
        listaDeEntrada6.insertFront(15);
        listaDeEntrada6.insertFront(7);
        listaDeEntrada6.insertFront(2);
        listaDeEntrada6.insertFront(4);
        listaDeEntrada6.insertFront(5);
        listaDeEntrada6.insertFront(3);

        System.out.println("Tamaño de la lista de Entrada: " + listaDeEntrada6.size());
        System.out.println("Lista de Entrada");
        listaDeEntrada6.print();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        listaDeSalida6 = listaPedida(listaDeEntrada6,15);
        System.out.println("Tamaño de la lista de Salida: " + listaDeSalida6.size());
        System.out.println("Lista de Salida");
        listaDeSalida6.print();
        System.out.println("/////////////////////////////////////////////////////////////////////////");

    }
}
