package tp1;

import tp1.ejercicio1.MySimpleLinkedList;

public class Main {

    public static void imprimeArrgelo(int vec[]){
        for (int i = 0; i < vec.length; i++){
            System.out.print(vec[i] + " // ");
        }
    }

    public static int[] cargaArreglo(int vec[]){
        for (int i = 0; i < vec.length; i++){
            vec[i] = (int) (Math.random()*20);
        }
        return vec;
    }

    public static void main(String[] args) {

        /*int[] vec = new int[10];
        int[] arr = cargaArreglo(vec);
        imprimeArrgelo(arr);*/

        MySimpleLinkedList lista = new MySimpleLinkedList();
        lista.insertFront(1);


    }
}
