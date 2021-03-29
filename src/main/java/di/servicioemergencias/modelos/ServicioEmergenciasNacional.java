package di.servicioemergencias.modelos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServicioEmergenciasNacional {
	protected List<UnidadEmergencias> unidadesActivas = Arrays.asList();
	
	
	public ServicioEmergenciasNacional(List<UnidadEmergencias> unidadesActivas) {
		this.unidadesActivas=unidadesActivas;
	}
	
	public void addNuevaUnidadActiva(UnidadEmergencias ue) {
		unidadesActivas.add(ue);
	}
	
	public void removeUnidadActiva(int id) {
		unidadesActivas = unidadesActivas.stream().filter(e -> e.id == id).collect(Collectors.toList());		
	}
	
	public void enviarEmergencia(TipoEmergencia te, String provincia) {
		System.out.println("### Atención a todas las Unidades ###\n ## Emergencia: " + te.toString() + " en la provincia de " + provincia);
		unidadesActivas.stream().forEach(e -> e.llamadaEmergencias(te, provincia));
	}
}
