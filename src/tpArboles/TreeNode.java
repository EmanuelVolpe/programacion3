package tpArboles;

import java.util.ArrayList;

public class TreeNode {

	private int valor;
	private TreeNode izquierda;
	private TreeNode derecha;

	//------------------------------ CONSTRUCTORES -------------------------------------------------------------------//
	public TreeNode(int value) {
		this.valor = value;
		this.izquierda = null;
		this.derecha = null;
	}

	public TreeNode() {
		this.valor = 0;
		this.izquierda = null;
		this.derecha = null;
	}
	//----------------------------------------------------------------------------------------------------------------//


	//------------------------- GETTERS Y SETTER IZQUIERDA Y DERECHA -------------------------------------------------//
	public TreeNode getIzq() {
		return izquierda;
	}

	public void setIzq(TreeNode left) {
		this.izquierda = left;
	}

	public TreeNode getDer() {
		return derecha;
	}

	public void setDer(TreeNode right) {
		this.derecha = right;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) { this.valor = valor; }
	//----------------------------------------------------------------------------------------------------------------//



	//----------------------------------------------------------------------------------------------------------------//



	//----------------------------------------------------------------------------------------------------------------//



	//----------------------------------------------------------------------------------------------------------------//

}
