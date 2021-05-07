package tpArboles;

import java.util.ArrayList;

public class TreeWithNode {

	private TreeNode raiz;

	//------------------------------ CONSTRUCTORES -------------------------------------------------------------------//
	public TreeWithNode() {
		this.raiz = null;
	}

	public TreeWithNode(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			TreeNode nodo = new TreeNode(arr[i]);
			add(nodo.getValor());
		}
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------ METODO AGREGAR ------------------------------------------------------------------------------------//
	public void add(int value) {
		if (this.raiz == null)
			this.raiz = new TreeNode(value);
		else
			this.add(this.raiz, value); // estoy llamando al OTRO metodo ADD(con 2 parametros)
	}
	
	// O(h) donde h es la altura del arbol (la longitud de la rama mas larga)
	private void add(TreeNode actual, int valor) {
		if (actual.getValor() > valor) {
			if (actual.getIzq() == null) { 
				TreeNode temp = new TreeNode(valor);
				actual.setIzq(temp);
			} else {
				add(actual.getIzq(),valor);
			}
		} else {
			if (actual.getDer() == null) { 
				TreeNode temp = new TreeNode(valor);
				actual.setRight(temp);
			} else {
				add(actual.getDer(),valor);
			}
		}
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------ OBTENER ALTURA DEL ARBOL --------------------------------------------------------------------------//
	// O(n) donde n es la cantidad de nodos del arbol
	public int getHeight() {
		if (this.raiz == null)
			return 0;
		else
			return this.getHeight(this.raiz); // O(n)
	}
	
	// Complejidad O(n) donde n es la cantidad de nodos del arbol
	private int getHeight(TreeNode cursor) {
		if (cursor.getIzq() == null && cursor.getDer() == null) { // Es una hoja
			return 0; // Soy chato, tengo altura 0
		} else {
			// Si tengo al menos un hijo
			int alturaIzq = 0;
			int alturaDer = 0;
			if (cursor.getIzq() != null)
				alturaIzq = 1 + this.getHeight(cursor.getIzq());
			if (cursor.getDer() != null)
				alturaDer = 1 + this.getHeight(cursor.getDer());
			int mayor = Math.max(alturaIzq, alturaDer);
			return mayor;	
		}
	}
	//----------------------------------------------------------------------------------------------------------------//


	//--------------------------- OBTENER DATOS DE LA RAIZ -----------------------------------------------------------//
	public Integer getRoot(){
		if(this.raiz != null)
			return this.raiz.getValor();
		return null;
	}

	/*public int getValorRoot(){
		if(this.getRoot() != null)
			return this.getRoot().getValor();
		return -9999;
	}*/
	//----------------------------------------------------------------------------------------------------------------//


	//----------------------------- VACIO O NO -----------------------------------------------------------------------//
	public boolean isEmpty(){
		return this.raiz == null;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//--------------------------- RECORRIDO IN_ORDER -----------------------------------------------------------------//
	public void printInOrder() {
		if (this.raiz == null)
			return;
		else
			this.printInOrder(this.raiz); // O(n)
	}

	private void printInOrder(TreeNode raiz) {
		if (raiz == null)
			return;
		printInOrder(raiz.getIzq());
		System.out.print(raiz.getValor() + ", ");
		printInOrder(raiz.getDer());
	}
	//----------------------------------------------------------------------------------------------------------------//


	//----------------------------- RECORRIDO POST_ORDER -------------------------------------------------------------//
	public void printPostOrder() {
		if (this.raiz == null)
			return;
		else
			this.printPostOrder(this.raiz); // O(n)
	}
	private void printPostOrder(TreeNode raiz) {
		if (raiz == null)
			return;
		printPostOrder(raiz.getIzq());
		printPostOrder(raiz.getDer());
		System.out.print(raiz.getValor() + ", ");
	}
	//----------------------------------------------------------------------------------------------------------------//


	//---------------------------- RECORRIDO PRE_ORDER ---------------------------------------------------------------//
	public void printPreOrder() {
		if (this.raiz == null)
			return;
		else
			this.printPreOrder(this.raiz); // O(n)
	}
	private void printPreOrder(TreeNode raiz) { //falta incorporar los separadores ("-")
		if (raiz == null)
			return;
		System.out.print(raiz.getValor() + ", ");
		printPreOrder(raiz.getIzq());
		printPreOrder(raiz.getDer());
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------------- OBTENER MAXIMO ELEMENTO --------------------------------------------------------------//
	public int getMaxElem(){
		if (raiz == null)
			return -9999;
		else {
			TreeNode nodo = raiz;
			while(nodo.getDer() != null) {
				nodo = nodo.getDer();
			}
			return nodo.getValor();
		}
	}
	//----------------------------------------------------------------------------------------------------------------//


	//--------------------------------- TIENE O NO UN ELEMENTO -------------------------------------------------------//
	public boolean hasElem(int info) {
		TreeNode nodo = raiz;
		while (nodo != null) {
			if (info == nodo.getValor()) {
				return true;
			} else if (info > nodo.getValor()) {
				nodo= nodo.getDer();
			} else {
				nodo = nodo.getIzq();
			}
		}
		return false;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------ OBTIENE LISTA CON LAS HOJAS DEL ARBOL -------------------------------------------------------//
	public ArrayList<Integer> getFrontera() {
		ArrayList<Integer> hojas = new ArrayList<Integer>();
		raiz.listarHojas(hojas);
		return hojas;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------ OBTIENE LISTA CON LOS NODOS DE LA RAMA MAS LARGA --------------------------------------------//
	public ArrayList<Integer> getLongestBranch() {
		ArrayList<Integer> ramaMasLarga;
		ramaMasLarga = raiz.getLongestBranch();
		return ramaMasLarga;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------ OBTIENE LISTA CON LOS NODOS UN NIVEL PEDIDO -------------------------------------------------//
	public ArrayList<Integer> getElementAtLevel(int nivel){
		return raiz.getElementAtLevelLista(nivel,0);
	}
	//----------------------------------------------------------------------------------------------------------------//








}