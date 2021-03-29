package di.servicioemergencias;

import java.util.Arrays;

import di.servicioemergencias.modelos.Ambulancia;
import di.servicioemergencias.modelos.Bombero;
import di.servicioemergencias.modelos.Policia;
import di.servicioemergencias.modelos.ServicioEmergenciasNacional;
import di.servicioemergencias.modelos.TipoEmergencia;
import di.servicioemergencias.modelos.Trabajador;
import di.servicioemergencias.modelos.UnidadEmergenciasBuilder;

public class App {

	public static void main(String[] args) {
		// Creo los trabajadores
		Trabajador uno = new Trabajador(1, "Manolo");
		Trabajador dos = new Trabajador(2, "Pepe");
		Trabajador tres = new Trabajador(3, "Benito");
		Trabajador cuatro = new Trabajador(4, "Laura");
		Trabajador cinco = new Trabajador(5, "Victoria");
		Trabajador seis = new Trabajador(6, "Rosa");
		Trabajador siete = new Trabajador(7, "Miguel");
		
		// Creo las unidades de emergencias
		Ambulancia a = UnidadEmergenciasBuilder.crearUnidadAmbulancia(1, Arrays.asList(uno, dos, tres), "Zaragoza");
		Ambulancia b = UnidadEmergenciasBuilder.crearUnidadAmbulancia(2, Arrays.asList(uno, dos, tres), "Teruel");
		Ambulancia c = UnidadEmergenciasBuilder.crearUnidadAmbulancia(3, Arrays.asList(uno, dos, tres), "Huesca");
		
		Bombero d = UnidadEmergenciasBuilder.crearUnidadBomberos(4, Arrays.asList(uno, dos, tres, cuatro, cinco), "Zaragoza");
		Bombero e = UnidadEmergenciasBuilder.crearUnidadBomberos(5, Arrays.asList(uno, dos, tres, cuatro, cinco), "Teruel");
		Bombero f = UnidadEmergenciasBuilder.crearUnidadBomberos(6, Arrays.asList(uno, dos, tres, cuatro, cinco), "Huesca");
		
		Policia g = UnidadEmergenciasBuilder.crearUnidadPolicia(7, Arrays.asList(seis, siete), "Zaragoza");
		Policia h = UnidadEmergenciasBuilder.crearUnidadPolicia(8, Arrays.asList(tres, siete), "Teruel");
		Policia i = UnidadEmergenciasBuilder.crearUnidadPolicia(9, Arrays.asList(cinco, siete), "Huesca");
		
		// Creo el servicio de emergencias y añado todas las unidades
		ServicioEmergenciasNacional sen = new ServicioEmergenciasNacional(Arrays.asList(a,b,c,d,e,f,g,h,i));
		
		sen.enviarEmergencia(TipoEmergencia.AccidenteCasero, "Zaragoza");
		sen.enviarEmergencia(TipoEmergencia.AccidenteTrafico, "Zaragoza");
		sen.enviarEmergencia(TipoEmergencia.IncendioInundación, "Teruel");
		sen.enviarEmergencia(TipoEmergencia.AccidenteTrafico, "Zaragoza");
		sen.enviarEmergencia(TipoEmergencia.AccidenteCasero, "Huesca");
		sen.enviarEmergencia(TipoEmergencia.AccidenteTrafico, "Huesca");		
		sen.enviarEmergencia(TipoEmergencia.IncendioInundación, "Zaragoza");
	}

}
