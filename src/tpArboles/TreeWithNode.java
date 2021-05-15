package tpArboles;

import java.util.ArrayList;

public class TreeWithNode {

	private TreeNode raiz;

	//------------------------------ CONSTRUCTORES -------------------------------------------------------------------//
	public TreeWithNode() {
		this.raiz = null;
	}

	// Complejidad O(n) donde n es el tamaño del arreglo
	public TreeWithNode(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			TreeNode nodo = new TreeNode(arr[i]);
			add(nodo.getValor());
		}
	}
	//----------------------------------------------------------------------------------------------------------------//


	//----------------------------- METODO AGREGAR -------------------------------------------------------------------//
	public void add(int value) {
		if (this.raiz == null)
			this.raiz = new TreeNode(value);
		else
			this.add(this.raiz, value); //Estoy llamando al OTRO metodo ADD(con 2 parametros)
	}
	
	// Complejidad O(n) donde n es la altura del arbol (Corresponde a la longitud de la rama mas larga)
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
				actual.setDer(temp);
			} else {
				add(actual.getDer(),valor);
			}
		}
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------------------ RETORNA ALTURA DEL ARBOL --------------------------------------------------------//
	// Complejidad O(n) donde n es la cantidad de nodos del arbol
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


	//--------------------------- RETORNA LOS DATOS DE LA RAIZ -------------------------------------------------------//
	// Complejidad O(1). Es constante ya que siempre devuelve un valor
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
	// Complejidad O(1). Es constante ya que siempre devuelve un valor
	public boolean isEmpty(){
		return this.raiz == null;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//--------------------------- RECORRIDO IN_ORDER -----------------------------------------------------------------//
	public void printInOrder() {
		if (this.raiz == null)
			return;
		else
			this.printInOrder(this.raiz);
	}

	// Complejidad O(n) donde n es la cantidad de nodos del arbol
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
			this.printPostOrder(this.raiz);
	}

	// Complejidad O(n) donde n es la cantidad de nodos del arbol
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
			this.printPreOrder(this.raiz);
	}
	/*private void printPreOrder(TreeNode raiz) {
		if (raiz == null)
			return;
		System.out.print(raiz.getValor() + ", ");
		printPreOrder(raiz.getIzq());
		printPreOrder(raiz.getDer());
	}*/

	// Complejidad O(n) donde n es la cantidad de nodos del arbol
	private void printPreOrder(TreeNode nodo){
		System.out.print(nodo.getValor() + ",");
		if(nodo.getIzq()!= null){
			printPreOrder(nodo.getIzq());
		} else {
			System.out.print("-,");
		}
		if(nodo.getDer()!=null){
			printPreOrder(nodo.getDer());
		} else {
			System.out.print("-,");
		}
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------------- RETORNA EL MAXIMO ELEMENTO --------------------------------------------------------------//
	/* Complejidad O(h) donde h es la longitud de la rama "más a la derecha".
	 */
	public Integer getMaxElem(){
		if (raiz == null)
			return null;
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
	/* Complejidad O(n) donde n es la cantidad de nodos del arbol. El caso más desfavorable se produce cuando el valor
	 * buscado se encuentra al final del arbol, ya que tengo que reccorer toda la estructura del mismo.
	 */
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


	//------------------ RETORNA LISTA CON LAS HOJAS DEL ARBOL -------------------------------------------------------//
	/* Complejidad O(n) donde n es la cantidad de nodos del arbol. Debo recorrer todos los nodos del arbol hasta llegar
	 * a cada una de sus hojas.
	 */
	public ArrayList<Integer> getFrontera() {
		ArrayList<Integer> hojas = new ArrayList<Integer>();
		hojas = listarHojas(raiz);
		return hojas;
	}
	private ArrayList<Integer> listarHojas(TreeNode puntero) {
		ArrayList<Integer> lista = new ArrayList<Integer>();

		if (puntero == null) {
			return null;
		}
		if (puntero.getIzq() == null && puntero.getDer() == null) {
			lista.add(puntero.getValor());
		}
		if (puntero.getIzq() != null){
			lista.addAll(listarHojas(puntero.getIzq()));
		}
		if (puntero.getDer() != null){
			lista.addAll(listarHojas(puntero.getDer()));
		}
		return lista;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------ RETORNA LISTA CON LOS NODOS DE LA RAMA MAS LARGA --------------------------------------------//
	// Complejidad O(n) donde n es la cantidad de nodos del arbol.
	public ArrayList<Integer> getLongestBranch() {
		ArrayList<Integer> ramaMasLarga;
		ramaMasLarga = getLongestBranchAux(this.raiz);
		return ramaMasLarga;
	}

	private ArrayList<Integer> getLongestBranchAux(TreeNode puntero) {
		ArrayList<Integer> listaIzquierda = new ArrayList<Integer>();
		ArrayList<Integer> listaDerecha = new ArrayList<Integer>();
		ArrayList<Integer> listaFinal = new ArrayList<Integer>();

		if (puntero == null) {
			return listaFinal;
		}

		if (puntero.getIzq() == null && puntero.getDer() == null) {
			listaFinal.add(puntero.getValor());
			return listaFinal;
		}
		if(puntero.getIzq() != null){
			listaIzquierda.add(puntero.getValor());
			listaIzquierda.addAll(getLongestBranchAux(puntero.getIzq()));
		}
		if(puntero.getDer() != null){
			listaDerecha.add(puntero.getValor());
			listaDerecha.addAll(getLongestBranchAux(puntero.getDer()));
		}
		if(listaDerecha.size() >= listaIzquierda.size()){
			listaFinal = listaDerecha;
		} else {
			listaFinal = listaIzquierda;
		}
		return listaFinal;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------ RETORNA LISTA CON LOS NODOS UN NIVEL PEDIDO -------------------------------------------------//
	/* Complejidad O(n) donde n es el numero de nodos del arbol. El caso mas desfavorable se presenta si se pide obtener
	 * los elementos del ultimo nivel(Hojas del arbol).
	 */
	public ArrayList<Integer> getElementAtLevel(int nivel){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		if (this.raiz != null){
			lista = getElementAtLevelLista(nivel,this.raiz);
			return lista;
		}
		return lista;
	}

	private ArrayList<Integer> getElementAtLevelLista(int nivel, TreeNode puntero){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		if(puntero == null){
			return null;
		}
		if(nivel == 0) { // soy una hoja debo retornar mi valor
			lista.add(puntero.getValor());
		}
		else {
			lista.addAll(getElementAtLevelLista(nivel-1, puntero.getIzq()));
			lista.addAll(getElementAtLevelLista(nivel-1, puntero.getDer()));
		}
		return lista;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------ RETORNA UN NODO(SI EXISTE) CON EL VALOR PEDIDO ----------------------------------------------//
	/* Complejidad O(n) donde n es la cantidad de nodos del arbol. El caso más desfavorable se produce cuando el valor
	 * buscado se encuentra al final del arbol, ya que tengo que reccorer toda la estructura del mismo.
	 */
	private TreeNode buscarNodo(int num){
		TreeNode aux = this.raiz;
		while (aux.getValor() != num){
			if(num < aux.getValor()){
				aux = aux.getIzq();
			}else{
				aux = aux.getDer();
			}
			if (aux == null){
				return null;
			}
		}
		return aux;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//---------------------------------------- DELETE ----------------------------------------------------------------//
	// Complejidad O(n) donde n es, en el caso mas desfavorable, la altura del arbol
	public boolean delete(int valor) {
		TreeNode aux = raiz;
		TreeNode padre = raiz;
		boolean esHijoIzq = true;

		while(aux.getValor() != valor){
			padre = aux;
			if(valor < aux.getValor()){
				esHijoIzq = true;
				aux = aux.getIzq();
			}else{
				esHijoIzq = false;
				aux = aux.getDer();
			}
			if (aux == null) {
				return false;
			}
		} // Fin del Ciclo While

		if(aux.getIzq() == null && aux.getDer() == null){
			if(aux == raiz){
				raiz = null;
			}else if (esHijoIzq){
				padre.setIzq(null);
			}else{
				padre.setDer(null);
			}
		}else if(aux.getDer() == null){
			if(aux == raiz){
				raiz = aux.getIzq();
			}else if (esHijoIzq){
				padre.setIzq(aux.getIzq());
			}else{
				padre.setDer(aux.getIzq());
			}
		}else if(aux.getIzq() == null){
			if(aux == raiz){
				raiz = aux.getDer();
			}else if (esHijoIzq){
				padre.setIzq(aux.getDer());
			}else{
				padre.setDer(aux.getDer()); //Habia puesto getIzq() y perdia el 10 !!!!!
			}
		}else{
			TreeNode nodoReemplazo = getNodoReemplazo(aux);
			if (aux == raiz){
				raiz = nodoReemplazo;
			} else if (esHijoIzq){
				padre.setIzq(nodoReemplazo);
			}else{
				padre.setDer(nodoReemplazo);
			}
			nodoReemplazo.setIzq(aux.getIzq());
		}
		return true;
	}

	private TreeNode getNodoReemplazo(TreeNode nodoReemp){
		TreeNode reemplazaPadre = nodoReemp;
		TreeNode reemplazo = nodoReemp;
		TreeNode auxiliar = nodoReemp.getDer();

		while (auxiliar != null){
			reemplazaPadre = reemplazo;
			reemplazo = auxiliar;
			auxiliar = auxiliar.getIzq();
		}
		if (reemplazo != nodoReemp.getDer()){
			reemplazaPadre.setIzq(reemplazo.getDer());
			reemplazo.setDer(nodoReemp.getDer());
		}
		System.out.println("El nodo reemplazo es: " + reemplazo.getValor());
		return reemplazo;
	}
	//----------------------------------------------------------------------------------------------------------------//
}