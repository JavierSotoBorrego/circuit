package circuitEstado;

public class circuitEstado {

		private int ok;
		private int nok;
		private int porcentaje;

		

		public circuitEstado() {
			super();
		}
		
		public circuitEstado(int ok, int nok, int porcentaje) {
			super();
			this.ok = ok;
			this.nok = nok;
			this.porcentaje = porcentaje;
			
		}
		
		public int getOk() {
			return ok;
		}
		public void setOk(int ok) {
			this.ok = ok;
		}
		public int getNok() {
			return nok;
		}
		public void setNok(int nok) {
			this.nok = nok;
		}
		public int getPorcentaje() {
			return porcentaje;
		}
		public void setPorcentaje(int porcentaje) {
			this.porcentaje = porcentaje;
		}

		
public String Estado() {
	String retorno;
	int limiteFallos=(ok+nok)*porcentaje/100;
	if(nok==0 || nok <=limiteFallos) {
		retorno = "CLOSED";
	}else if(nok>limiteFallos){
		retorno = "OPEN";
	}else {
		retorno = "HALF-OPEN";
	}
	
	return retorno;	
}


	

}
