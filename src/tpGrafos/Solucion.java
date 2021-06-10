package tpGrafos;

import java.util.ArrayList;

public class Solucion {
    public ArrayList<String> camino;
    public int kilometros;
    public int balanza;
    public Ciudad ciudadActual;
    public Ciudad ciudadSiguiente;


    public Solucion(Ciudad ciudadActual, Ciudad ciudadSiguiente, int kilometros, int balanza){
        this.camino = new ArrayList<>();
        this.kilometros = kilometros;
        this.balanza = balanza;
        this.ciudadActual = ciudadActual;
        this.ciudadSiguiente = ciudadSiguiente;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public ArrayList<String> getCamino() {
        return camino;
    }

    public void setCamino(ArrayList<String> camino) {
        this.camino = camino;
    }

    public void agregarLista(ArrayList<String> ciudad) {
        for(int i=0; i<ciudad.size(); i++) {
            this.camino.add(ciudad.get(i));
        }
    }

    public int getBalanza() {
        return balanza;
    }

    public void setBalanza(int balanza) {
        this.balanza = balanza;
    }

    public boolean isEmpty() {
        return (this.camino.size()==0);
    }

    public void addCiudad(String ciudad) {
        this.camino.add(ciudad);
    }

    public void removeCiudad(String ciudad){
        for(int i=0; i<camino.size(); i++) {
            if(camino.get(i).equals(ciudad)) {
                this.camino.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------\n" +
                "Recorrido Solución: \n" +
                "___________________ \n" +
                "Camino: " + camino + "\n" + "Kilómetros Recorridos: " + kilometros + "\n" + "Balanza: " + balanza+ "\n" +
                "---------------------------------------------------------------\n";
    }
}
