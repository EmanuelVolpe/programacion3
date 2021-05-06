package tpArboles;

import java.util.ArrayList;

public class TreeNode {

	private int valor;
	private TreeNode izquierda;
	private TreeNode derecha;

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

	public TreeNode getIzq() {
		return izquierda;
	}

	public void setIzq(TreeNode left) {
		this.izquierda = left;
	}

	public TreeNode getDer() {
		return derecha;
	}

	public void setRight(TreeNode right) {
		this.derecha = right;
	}

	public int getValor() {
		return valor;
	}

	public void listarHojas(ArrayList<Integer> lista) {
		if (this.getIzq() == null && this.getDer() == null) {
			lista.add(this.getValor());
		}
		else if (this.getIzq() != null && this.getDer() != null) {
			this.getIzq().listarHojas(lista);
			this.getDer().listarHojas(lista);
		}
		else if (this.getIzq() != null && this.getDer() == null)
			this.getIzq().listarHojas(lista);
		else
			this.getDer().listarHojas(lista);
	}

	public ArrayList<Integer> getLongestBranch() {
		ArrayList<Integer> listaIzquierda = new ArrayList<Integer>();
		ArrayList<Integer> listaDerecha = new ArrayList<Integer>();
		ArrayList<Integer> listaFinal = new ArrayList<Integer>();

		if (this.getIzq() == null && this.getDer() == null) {
			listaFinal.add(this.getValor());
			return listaFinal;
		}
		if(this.getIzq() != null){
			listaIzquierda.add(this.getValor());
			listaIzquierda.addAll(this.getIzq().getLongestBranch());
		}
		if(this.getDer() != null){
			listaDerecha.add(this.getValor());
			listaDerecha.addAll(this.getDer().getLongestBranch());
		}
		if(listaDerecha.size() >= listaIzquierda.size()){
			listaFinal = listaDerecha;
		} else {
			listaFinal = listaIzquierda;
		}
		return listaFinal;
	}


}
