package tpGrafos.entregable;

import tpGrafos.Grafo;
import tpGrafos.GrafoNoDirigido;
import java.util.HashMap;
import java.util.Iterator;

public class Mapa {

	private Grafo<Integer> grafo;
	private HashMap<Integer,Ciudad> ciudades;
	
	public Mapa() {
		this.grafo = new GrafoNoDirigido<Integer>();
		this.ciudades = new HashMap<>();
	}
	
	public void addCiudad(Ciudad ciudad) {
		this.ciudades.put(ciudad.getId(), ciudad);
		this.grafo.agregarVertice(ciudad.getId());
	}
	
	public void borrarCiudad(Ciudad ciudad) {
		this.grafo.borrarVertice(ciudad.getId());
		this.ciudades.remove(ciudad.getId());
	}
	
	public void addRuta(Ciudad origen, Ciudad destino, int kilometros) {
		this.grafo.agregarArco(origen.getId(), destino.getId(), kilometros);
	}

	public void borrarRuta(Ciudad origen, Ciudad destino) {
		this.grafo.borrarArco(origen.getId(), destino.getId());
	}
	
	/*
	 * Esto es un solo un código de ejemplo de como se usarían las estructuras
	 * La interfaz (retorno o parametros) de este método se puede cambiar, 
	 * y por supuesto se pueden crear mas métodos en esta clase en caso de ser necesario
	 */
	 /*public ¿Solucion? encontrarCamino(Ciudad origen, Ciudad destino) {
		
		// TODO Aca hacer la logica que corresponda
		
		// Obtengo todas las rutas salientes de mi ciudad origen
		Iterator<Arco<Integer>> iterador = this.grafo.obtenerArcos(origen.getId());
		
		while (iterador.hasNext()) {
			Arco<Integer> arco = iterador.next(); // Arco que representa la ruta
			int kilometros = arco.getEtiqueta(); // Kilometros de la ruta
			int idDestino = arco.getVerticeDestino(); // ID de ciudad destino
			Ciudad ciudadAdyacente = this.ciudades.get(idDestino); // Objeto de ciudad destino
		}
		
		return null;
	}*/

	
}
