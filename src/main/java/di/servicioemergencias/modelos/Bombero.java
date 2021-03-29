package di.servicioemergencias.modelos;

import java.util.List;

public class Bombero extends UnidadEmergencias implements SistemaEmergencias {
	
	public Bombero(int id, List<Trabajador> equipo, String provincia) {
		super(id, equipo, provincia);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void llamadaEmergencias(TipoEmergencia te, String provincia) {
		if (this.provincia.equals(provincia) 
				&& (te.equals(TipoEmergencia.AccidenteTrafico) 
						|| te.equals(TipoEmergencia.IncendioInundación))) {
			System.out.println("## Unidad de Bomberos: " + this.id + " con base en " + this.provincia + " se dirige a la llamada! ");
		}
	}
}
