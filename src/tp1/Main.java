package tp1;

import tp1.ejercicio1.MyIterator;
import tp1.ejercicio1.MySimpleLinkedList;

import java.util.Iterator;

public class Main {

    /*public static void imprimeArrgelo(int vec[]){
        for (int i = 0; i < vec.length; i++){
            System.out.print(vec[i] + " // ");
        }
    }

    public static int[] cargaArreglo(int vec[]){
        for (int i = 0; i < vec.length; i++){
            vec[i] = (int) (Math.random()*20);
        }
        return vec;
    }*/

    public static void main(String[] args) {

        /*int[] vec = new int[10];
        int[] arr = cargaArreglo(vec);
        imprimeArrgelo(arr);*/

        MySimpleLinkedList lista = new MySimpleLinkedList();
        lista.insertFront(10);
        lista.insertFront(20);
        lista.insertFront(30);
        lista.insertFront(40);
        lista.insertFront(47);
        lista.insertFront(50);
        lista.insertFront(60);
        lista.insertFront(70);
        lista.insertFront(80);

        System.out.println("///////////////////////////////");

        lista.print();

    }
}
