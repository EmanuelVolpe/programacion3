package tpArboles;

public class Pruebita {

    public static void burbujeo(int[] arr) {
        int i, j, aux;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static void bubbleSortAdapt(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i=0; i<arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    // Recorro el arreglo iterativavamente para ver si está ordenado
    public static boolean estaOrdenadoIterativo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int aux = arr[i];
            if (aux > arr[i+1])
                return false;
        }
        return true;
    }

    // Recorro el arreglo recursivamente para ver si está ordenado
    public static boolean estaOrdenadoRecursivo(int[] arr, int index) {
        if(index == arr.length-1)
            return true;
        if (arr[index] > arr[index+1])
            return false;
        boolean elRestoEstaOrdenado = estaOrdenadoRecursivo(arr, index + 1);
        return elRestoEstaOrdenado;
    }

    public static void informaOrden(boolean flag){
        if(flag)
            System.out.println("El arreglo está ordenado");
        else
            System.out.println("El arreglo está desordenado");
    }

    public static void main(String[] args) {

        boolean flag;

        int arr [] = new int[] {6, 50, 300, 10000, 15, 25, 30};

        //burbujeo(arr);
        //bubbleSortAdapt(arr);

        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        };*/

        flag = estaOrdenadoRecursivo(arr, 0);
        informaOrden(flag);


    }
}
