package tpGrafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		//Creo un grafo dirigdo donde las etiquetas de los arcos son valores Float
		GrafoNoDirigido<Float> grafito = new GrafoNoDirigido<>();

		// Agrego los vertices 1 y 2
		grafito.agregarVertice(1);
		grafito.agregarVertice(2);


		// Genero un arco desde 1 hasta 2 con el valor de etiqueta 3
		grafito.agregarArco(1, 2, 3F);
		
		// Obtengo el arco entre 1 y 2, y le pido la etiqueta
		Float etiqueta = grafito.obtenerArco(1, 2).getEtiqueta();
		
		System.out.println(etiqueta); // Deber�a imprimir 3

	}

}
