package tp1;

import tp1.ejercicio1.MySimpleLinkedList;

public class Main {

    public static void main(String[] args) {

        MySimpleLinkedList listaDeSalida = new MySimpleLinkedList();

        MySimpleLinkedList listaDeEntrada = new MySimpleLinkedList();
        listaDeEntrada.insertFront(28);
        listaDeEntrada.insertFront(14);
        listaDeEntrada.insertFront(15);
        listaDeEntrada.insertFront(7);
        listaDeEntrada.insertFront(2);
        listaDeEntrada.insertFront(4);
        listaDeEntrada.insertFront(5);
        listaDeEntrada.insertFront(3);

        /*listaDeEntrada.insertFront(3);
        listaDeEntrada.insertFront(2);
        listaDeEntrada.insertFront(1);*/

        /*listaDeEntrada.insertFront(28);
        listaDeEntrada.insertFront(14);
        listaDeEntrada.insertFront(19);
        listaDeEntrada.insertFront(7);
        listaDeEntrada.insertFront(2);
        listaDeEntrada.insertFront(5);
        listaDeEntrada.insertFront(3);*/


        listaDeEntrada.print();
        System.out.println("Tamaño de la lista de Entrada: " + listaDeEntrada.size());
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");


        listaDeSalida = listaDeSalida.listaPedida(listaDeEntrada,15);
        listaDeSalida.reverse().print();
        System.out.println("Tamaño de la lista de Salida: " + listaDeSalida.size());
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");






    }
}
