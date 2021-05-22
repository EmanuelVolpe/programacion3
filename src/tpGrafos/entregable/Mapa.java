package tpGrafos.entregable;

import tpGrafos.Arco;
import tpGrafos.Grafo;
import tpGrafos.GrafoNoDirigido;
import java.util.HashMap;
import java.util.Iterator;

public class Mapa {

	private Grafo<Integer> grafo;
	private HashMap<Integer,Ciudad> ciudades;
	HashMap<Integer,String> colores = new HashMap<>();
	Solucion mejorSolucion;
	
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
	 private void encontrarCamino(Ciudad origen, Ciudad destino, Solucion s) {
	 	colores.put(origen.getId(), "amarillo");
	 	s.addCiudad(origen.getNombre());
	 	if(origen.isTieneBalanza()) {
	 		s.setBalanza(s.getBalanza()+1);
	 	}
	 	if (destino.getId() == origen.getId()){
	 		if(this.mejorSolucion == null){
	 			this.mejorSolucion = new Solucion(origen, destino, s.getKilometros(), s.getBalanza());
				this.mejorSolucion.agregarLista(s.getCamino());
			} else if (s.getKilometros() < this.mejorSolucion.getKilometros() && (s.getBalanza()<=this.mejorSolucion.getBalanza())){
				this.mejorSolucion = new Solucion(origen, destino, s.getKilometros(), s.getBalanza());
				this.mejorSolucion.agregarLista(s.getCamino());
			}
		} else {
	 		Iterator<Arco<Integer>> iterador = this.grafo.obtenerArcos(origen.getId());
			while (iterador.hasNext()) {
				Arco<Integer> arco = iterador.next();
				if (colores.get(arco.getVerticeDestino()).equals("blanco")){
					s.setKilometros(s.getKilometros() + arco.getEtiqueta());
					int idDestino = arco.getVerticeDestino();
					Ciudad ciudadAdyacente = this.ciudades.get(idDestino);
					encontrarCamino(ciudadAdyacente, destino, s);
					s.setKilometros(s.getKilometros() - arco.getEtiqueta());
				}
			}
		}
	 	colores.put(origen.getId(),"blanco");
		 s.removeCiudad(origen.getNombre());
		 if(origen.isTieneBalanza()) {
			 s.setBalanza(s.getBalanza()-1);
		 }
	}

	public Solucion encontrarCamino(Ciudad origen, Ciudad destino) {
	 	for(int idCiudad: this.ciudades.keySet()){
	 		colores.put(idCiudad, "blanco");
		}
		if(ciudades.containsKey(origen.getId())&&ciudades.containsKey(destino.getId())) {
			encontrarCamino(origen,destino, new Solucion(origen,destino,0,0));
		}
	 	return this.mejorSolucion;
	}
}
