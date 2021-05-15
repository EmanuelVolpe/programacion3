package tpArboles;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//CREACION DEL ARBOL
		int[] valoresIniciales = new int[]{15, 4, 1, 25, 50, 6, 7, 20, 5, 30};

		//int[] valoresIniciales = new int[]{2, 6, 9, 10, 12}; //Arreglo de Prueba que dijo Sebas
		TreeWithNode tree = new TreeWithNode(valoresIniciales);

		//---------------- PRIMERA ITERACION -------------------------------------------------------------------------//
		System.out.println("El recorrido pedido es: ");
		tree.printPreOrder();
		System.out.println(" ");
		System.out.println("-------------------------------------------------------");
		System.out.println("Mayor elemento del Arbol: " + tree.getMaxElem());
		System.out.println("-------------------------------------------------------");
		System.out.println("La altura del arbol es: " + tree.getHeight());
		System.out.println("-------------------------------------------------------");
		System.out.println("Los nodos de la rama mas larga son: " + tree.getLongestBranch());
		System.out.println("-------------------------------------------------------");
		System.out.println("Las hojas del arbol son: " + tree.getFrontera());
		System.out.println("-------------------------------------------------------");
		System.out.println("Los elementos en el nivel pedido son: " + tree.getElementAtLevel(2));
		System.out.println(" ");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		//------------------------------------------------------------------------------------------------------------//


		//---------------- SEGUNDA ITERACION -------------------------------------------------------------------------//
		tree.add(23);
		tree.add(3);
		tree.delete(6);
		tree.delete(30);

		System.out.println("El recorrido pedido es: ");
		tree.printPreOrder();
		System.out.println(" ");
		System.out.println("-------------------------------------------------------");
		System.out.println("Mayor elemento del Arbol: " + tree.getMaxElem());
		System.out.println("-------------------------------------------------------");
		System.out.println("La altura del arbol es: " + tree.getHeight());
		System.out.println("-------------------------------------------------------");
		System.out.println("Los nodos de la rama mas larga son: " + tree.getLongestBranch());
		System.out.println("-------------------------------------------------------");
		System.out.println("Las hojas del arbol son: " + tree.getFrontera());
		System.out.println("-------------------------------------------------------");
		System.out.println("Los elementos en el nivel pedido son: " + tree.getElementAtLevel(2));
		System.out.println(" ");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		//------------------------------------------------------------------------------------------------------------//


		//---------------- TERCERA ITERACION -------------------------------------------------------------------------//
		tree.add(65);
		tree.delete(5);
		tree.delete(15);
		tree.add(55);

		System.out.println("El recorrido pedido es: ");
		tree.printPreOrder();
		System.out.println(" ");
		System.out.println("-------------------------------------------------------");
		System.out.println("Mayor elemento del Arbol: " + tree.getMaxElem());
		System.out.println("-------------------------------------------------------");
		System.out.println("La altura del arbol es: " + tree.getHeight());
		System.out.println("-------------------------------------------------------");
		System.out.println("Los nodos de la rama mas larga son: " + tree.getLongestBranch());
		System.out.println("-------------------------------------------------------");
		System.out.println("Las hojas del arbol son: " + tree.getFrontera());
		System.out.println("-------------------------------------------------------");
		System.out.println("Los elementos en el nivel pedido son: " + tree.getElementAtLevel(2));

	}
}
