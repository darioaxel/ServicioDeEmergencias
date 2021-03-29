package di.servicioemergencias.modelos;

import java.util.List;

public class UnidadEmergenciasBuilder {
	public static Bombero crearUnidadBomberos(int id, List<Trabajador> equipo, String provincia) {
		Bombero bombero = null;
		if (equipo.size() == 5) {
			bombero = new Bombero(id, equipo, provincia);
		}
		return bombero;
	}
	public static Policia crearUnidadPolicia(int id, List<Trabajador> equipo, String provincia) {
		Policia policia = null;
		if (equipo.size() == 2) {
			policia = new Policia(id, equipo, provincia);
		}
		return policia;
	}
	public static Ambulancia crearUnidadAmbulancia(int id, List<Trabajador> equipo, String provincia) {
		Ambulancia ambulancia = null;
		if (equipo.size() == 3) {
			ambulancia = new Ambulancia(id, equipo, provincia);
		}
		return ambulancia;
	}
}
