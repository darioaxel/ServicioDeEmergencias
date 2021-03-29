package di.servicioemergencias.modelos;

import java.util.List;

public class Policia  extends UnidadEmergencias implements SistemaEmergencias {
		
		public Policia(int id, List<Trabajador> equipo, String provincia) {
			super(id, equipo, provincia);
			// TODO Auto-generated constructor stub
		}
		@Override
		public void llamadaEmergencias(TipoEmergencia te, String provincia) {
			if (this.provincia.equals(provincia) 
					&& (te.equals(TipoEmergencia.AccidenteTrafico) 
							|| te.equals(TipoEmergencia.AccidenteCasero))) {
				System.out.println("## Unidad de Policia: " + this.id + " con base en " + this.provincia + " se dirige a la llamada! ");
			}
		}
}

