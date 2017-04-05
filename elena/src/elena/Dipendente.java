package elena;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private double straordinario;
    private double ore_straordinario = 0;
    
    public Dipendente(String m, double stip, double straord) {
        matricola = m;
        stipendio = stip;
        straordinario = straord;
    }
    
    public double getStipendio() {
        return this.stipendio;
    }
    
    public void fai_straordinari(double ore) {
    	ore_straordinario += ore;
    }
    
    public double paga() {
        double stipendio_plus = this.ore_straordinario*this.straordinario;
        return (this.stipendio + stipendio_plus);
    }
    
    public void stampa() {
        System.out.print("matricola: " + this.matricola + '\n' + "stipendio (€): " + this.stipendio + '\n' + "paga straordinaria(€/h): " + this.straordinario + '\n' + "ore di straordinario: " + this.ore_straordinario + '\n' + "paga: " + this.paga() + '\n');
    }
}
