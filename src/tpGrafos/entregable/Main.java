package tpGrafos.entregable;

public class Main {

	public static void main(String[] args) {
		

		// Se crea el mapa
		Mapa mapa = new Mapa();

		// Se crean las ciudades por orden alfabetico con sus respectivas caracteristicas
		// Se agregan las ciudades al mapa

		Ciudad ayacucho = new Ciudad(1,"Ayacucho");
		ayacucho.setEstacionesDeServicio(1);
		ayacucho.setTieneBalanza(false);
		ayacucho.setTieneRadar(false);
		ayacucho.setTalleresMecanicos(2);
		mapa.addCiudad(ayacucho);

		Ciudad azul= new Ciudad(2, "Azul");
		azul.setEstacionesDeServicio(4);
		azul.setTieneBalanza(false);
		azul.setTieneRadar(true);
		azul.setTalleresMecanicos(4);
		mapa.addCiudad(azul);

		Ciudad bolivar = new Ciudad(3,"Bolivar");
		bolivar.setEstacionesDeServicio(7);
		bolivar.setTieneBalanza(false);
		bolivar.setTieneRadar(false);
		bolivar.setTalleresMecanicos(4);
		mapa.addCiudad(bolivar);

		Ciudad mardelplata= new Ciudad(4, "Mar del Plata");
		mardelplata.setEstacionesDeServicio(15);
		mardelplata.setTieneBalanza(true);
		mardelplata.setTieneRadar(false);
		mardelplata.setTalleresMecanicos(12);
		mapa.addCiudad(mardelplata);

		Ciudad olavarria= new Ciudad(5,"Olavarria");
		olavarria.setEstacionesDeServicio(9);
		olavarria.setTieneBalanza(true);
		olavarria.setTieneRadar(false);
		olavarria.setTalleresMecanicos(17);
		mapa.addCiudad(olavarria);

		Ciudad pehuajo= new Ciudad (6, "Pehuajo");
		pehuajo.setEstacionesDeServicio(3);
		pehuajo.setTieneBalanza(true);
		pehuajo.setTieneRadar(true);
		pehuajo.setTalleresMecanicos(5);
		mapa.addCiudad(pehuajo);

		Ciudad rauch= new Ciudad(7, "Rauch");
		rauch.setEstacionesDeServicio(1);
		rauch.setTieneBalanza(false);
		rauch.setTieneRadar(true);
		rauch.setTalleresMecanicos(0);
		mapa.addCiudad(rauch);

		Ciudad tandil = new Ciudad(8,"Tandil");
		tandil.setEstacionesDeServicio(6);
		tandil.setTieneBalanza(true);
		tandil.setTieneRadar(true);
		tandil.setTalleresMecanicos(5);
		mapa.addCiudad(tandil);

		// Se agregan las rutas entre ciudades
		mapa.addRuta(ayacucho, pehuajo, 540);
		mapa.addRuta(ayacucho, rauch, 50);
		mapa.addRuta(ayacucho, tandil, 70);
		mapa.addRuta(bolivar, azul, 100);
		mapa.addRuta(bolivar, olavarria, 140);
		mapa.addRuta(bolivar, pehuajo, 70);
		mapa.addRuta(olavarria, rauch, 210);
		mapa.addRuta(tandil, mardelplata, 200);
		mapa.addRuta(tandil, olavarria, 130);
		mapa.addRuta(tandil, rauch, 60);


		// Resolver:
		/*  origen: Azul - destino: Ayacucho
		 *  origen: Rauch - destino: Mar del Plata
		 *  origen: Mar del plata - destino: Pehuajó
		 *  eliminar la ciudad Ayacucho.
		 *  eliminar la ruta Tandil - Rauch
		 *  origen: Mar del plata - destino Pehuajó
		*/

		Solucion solucion = mapa.encontrarCamino(azul,ayacucho); // Busco el mejor camino entre ayacucho y bolivar
		System.out.print(solucion);




	}

}
