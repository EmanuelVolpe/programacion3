package tpArboles;

public class Tree {

	private int valor;
	private Tree izquierda;
	private Tree derecha;

	public Tree(int valor) {
		this.valor = valor;
		this.izquierda = null;
		this.derecha = null;
	}

	public Tree() {
		this.valor = valor;
		this.izquierda = null;
		this.derecha = null;
	}

	/*public Tree(int[] arr) {
		this.izquierda = null;
		this.derecha = null;
	}*/

	public void add(int newValue) {
		if (newValue < this.valor) {
			if (this.izquierda == null)
				this.izquierda = new Tree(newValue);
			else
				this.izquierda.add(newValue);
		} else {
			if (this.derecha == null)
				this.derecha = new Tree(newValue);
			else
				this.derecha.add(newValue);
		}
	}
	
	// Complejidad O(n) donde n es la cantidad de valores del arbol
	public int getHeight() {
		//Este IF funciona como condicion de corte
		if (this.izquierda == null && this.derecha == null) { // Si soy una hoja o la raiz(altura cero)
			return 0; // Soy chato, tengo altura 0
		} else {
			// Si tengo al menos un hijo			
			int alturaIzq = 0;
			int alturaDer = 0;
			
			if (this.izquierda != null)
				alturaIzq = this.izquierda.getHeight() + 1;
			
			if (this.derecha != null)
				alturaDer = this.derecha.getHeight() + 1;
			
			int mayor = Math.max(alturaIzq, alturaDer);
			
			return mayor;			
		}
	}

		
}