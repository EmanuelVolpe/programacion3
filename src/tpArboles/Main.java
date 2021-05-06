package tpArboles;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int[] valoresIniciales = new int[]{15, 4, 1, 25, 50, 6, 7, 20, 5, 30};
		TreeWithNode tree = new TreeWithNode(valoresIniciales);

		/*TreeNode node0 = new TreeNode(15);
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(25);
		TreeNode node4 = new TreeNode(50);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(20);
		TreeNode node8 = new TreeNode(5);
		TreeNode node9 = new TreeNode(30);
		TreeNode node10 = new TreeNode(9);


		TreeWithNode tree = new TreeWithNode();
		tree.add(node0.getValor());
		tree.add(node1.getValor());
		tree.add(node2.getValor());
		tree.add(node3.getValor());
		tree.add(node4.getValor());
		tree.add(node5.getValor());
		tree.add(node6.getValor());
		tree.add(node7.getValor());
		tree.add(node8.getValor());
		tree.add(node9.getValor());
		tree.add(node10.getValor());*/

		System.out.println("La altura del arbol es: " + tree.getHeight());
		System.out.println("-------------------------------------------------------");
		System.out.println("Arbol vacio: " + tree.isEmpty());
		System.out.println("-------------------------------------------------------");
		System.out.println("Valor de la raiz del Arbol: " + tree.getRoot());
		System.out.println("-------------------------------------------------------");
		System.out.println("El recorrido pedido es: ");
		tree.printPostOrder();
		System.out.println(" ");
		System.out.println("-------------------------------------------------------");
		System.out.println("Mayor elemento del Arbol: " + tree.getMaxElem());
		System.out.println("-------------------------------------------------------");
		System.out.println("Tiene el elemento pedido: " + tree.hasElem(0));
		System.out.println("-------------------------------------------------------");
		System.out.println("Las hojas del arbol son: " + tree.getFrontera());
		System.out.println("-------------------------------------------------------");
		System.out.println("Los nodos de la rama mas larga son: " + tree.getLongestBranch());
		System.out.println("-------------------------------------------------------");


	}
}
