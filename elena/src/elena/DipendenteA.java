package elena;

public class DipendenteA extends Dipendente {
	
	private int malattia = 0;
	
	public DipendenteA(String m, double stip, double straord) {
		super(m, stip, straord);
	}
	
	public void prendi_malattia(int giorni) {
		malattia += giorni;
	}
	
	public double paga() {
		double p = super.paga();
		p -= (this.malattia*15);
		return p;
	}
	
	public void stampa_malattia() {
		System.out.print("giorni di malattia: " + this.malattia + '\n' + "paga corretta (€): " + this.paga());
	}
}
