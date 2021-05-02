package tpArboles;

public class Main {

	public static void main(String[] args) {

		//int[] valoresIniciales = new int[] {15, 4, 1, 25, 50, 6, 7, 20, 5, 30};
		//Tree miArbol = new Tree(valoresIniciales);

		TreeNode node0 = new TreeNode(15);
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(25);
		TreeNode node4 = new TreeNode(50);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(20);
		TreeNode node8 = new TreeNode(5);
		TreeNode node9 = new TreeNode(30);
		//TreeNode node10 = new TreeNode(9);


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
		//tree.add(node10.getValor());


		int altura = tree.getHeight();
		System.out.println(altura);

		System.out.println(tree.isEmpty());

		System.out.println(tree.getValorRoot());


		tree.printPostOrder(tree.getRoot());

	}

}
