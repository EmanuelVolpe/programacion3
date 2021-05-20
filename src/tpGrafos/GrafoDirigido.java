package tpGrafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GrafoDirigido<T> implements Grafo<T> {

	// Tercera vuelta
	private HashMap<Integer,ArrayList<Arco<T>>> mapaDeVertices;

	public GrafoDirigido() {
		this.mapaDeVertices = new HashMap<Integer,ArrayList<Arco<T>>>();
	}

	// Complejidad O(V) donde v es la cantidad de vertices del grafo
	@Override
	public void agregarVertice(int verticeId) {
		if(!mapaDeVertices.containsKey(verticeId))
			this.mapaDeVertices.put(verticeId, new ArrayList<Arco<T>>());
	}

	// Complejidad O(V) donde v es la cantidad de vertices del grafo
	@Override
	public void borrarVertice(int verticeId) {
		if(mapaDeVertices.containsKey(verticeId))
			this.mapaDeVertices.remove(verticeId);
	}

	// PREGUNTAR COMPLEJIDAD
	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		if(this.mapaDeVertices.containsKey(verticeId1) && this.mapaDeVertices.containsKey(verticeId2)){
			Arco newArco = new Arco<T>(verticeId1, verticeId2, etiqueta);
			ArrayList<Arco<T>> arcos = this.mapaDeVertices.get(verticeId1);
			if(!arcos.contains(newArco)){
				arcos.add(newArco);
				this.mapaDeVertices.put(verticeId1, arcos);
			}
		}
	}

	// Complejidad O(A) donde A es la cantidad de arcos de todo mi grafo
	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		Arco<T> arco = this.obtenerArco(verticeId1, verticeId2);
		if(arco != null){
			this.mapaDeVertices.get(verticeId1).remove(arco);
		}
	}

	// Complejidad O(V) donde v es la cantidad de vertices del grafo
	@Override
	public boolean contieneVertice(int verticeId) {
		return mapaDeVertices.containsKey(verticeId);
	}

	// Complejidad O(A) donde A es la cantidad de arcos de todo mi grafo
	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		return this.obtenerArco(verticeId1, verticeId2) != null;
	}

	// Complejidad O(A) donde A es la cantidad de arcos de todo mi grafo
	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		if(this.mapaDeVertices.containsKey(verticeId1)){
			ArrayList<Arco<T>> arcos = this.mapaDeVertices.get(verticeId1);
			Iterator<Arco<T>> it = arcos.iterator();
			Arco<T> arco = null;
			boolean found = false;
			while(it.hasNext() && found == false){
				arco = it.next();
				if(arco.getVerticeDestino() == verticeId2){
					found = true;
				}
			}
			if(found){
				return arco;
			}else{
				return null;
			}
		}
		return null;
	}

	// Complejidad O(V) donde V es la cantidad de vertices de todo mi grafo
	@Override
	public int cantidadVertices() {
		return this.mapaDeVertices.keySet().size();
	}

	// Complejidad O(A) donde A es la cantidad de arcos de todo mi grafo
	@Override
	public int cantidadArcos() {
		Integer cantidadArcos = 0;
		Iterator<Integer> it = this.mapaDeVertices.keySet().iterator();
		while (it.hasNext()) {
			cantidadArcos += this.mapaDeVertices.get(it.next()).size();
		}
		return cantidadArcos;
	}

	// O(1) es solo crear un iterador y devolverlo
	@Override
	public Iterator<Integer> obtenerVertices() {
		
		// Forma 1 : Mal
		// Iterator<Vertice<T>> it = this.vertices.iterator(); // O(1)
		// return it; // NO!	 
	
		// Forma 2: Valida, pero O(n)
		//ArrayList<Integer> aux = new ArrayList<>();
		//for (Vertice<T> vertice: this.vertices) // O(n) donde n es la cantidad de vertices
		//	aux.add(vertice.getId());
		//return aux.iterator();
	
		// Forma 2.1: O(1)
		//Iterator<Vertice<T>> it = this.vertices.iterator();
		//IteradorVertice<T> iterador = new IteradorVertice<T>(it); 
		//return iterador;
		
		// Forma 3: Valida y O(1) en caso de usar hashmap
		return this.mapaDeVertices.keySet().iterator();
	}

	// Complejidad O(a) donde a es la cantidad de arcos de salientes de un vertice
	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		ArrayList<Integer> adyacentes = new ArrayList<Integer>();
		Iterator<Arco<T>> it = this.mapaDeVertices.get(verticeId).iterator();
		while (it.hasNext()){
			adyacentes.add(it.next().getVerticeDestino());
		}
		return adyacentes.iterator();
	}

	// O(A) arcos del grafo
	// O(a) arcos salientes de un vertice
	// O(V) vertices del grafo
	
	@Override // O(A) donde A es la cantidad total de arcos
	public Iterator<Arco<T>> obtenerArcos() {
		ArrayList<Arco<T>> todosLosArcos = new ArrayList<>();
		Iterator<Integer> it = this.mapaDeVertices.keySet().iterator();
		while (it.hasNext()){
			Iterator<Arco<T>> arcosIt = this.obtenerArcos(it.next());
			while(arcosIt.hasNext()){
				todosLosArcos.add(arcosIt.next());
			}
		}
		return todosLosArcos.iterator();
	}

	@Override // O(n) donde n es la cantidad de arcos de todo mi grafo
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		ArrayList<Arco<T>> arcos = this.mapaDeVertices.get(verticeId);
		Iterator<Arco<T>> it = this.obtenerArcos(verticeId);
		while (it.hasNext()){
			arcos.add(it.next());
		}
		return arcos.iterator();
	}

}
