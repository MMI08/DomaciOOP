package doktor;

import java.time.LocalDate;

public class Nefrolog extends Doktor {
	
	private int brojPacijenata;
	private String odeljenje;
	 private int godineIskustva;
	 
	 public Nefrolog()
	    {
	    	
	    }
	    public Nefrolog(String ime)
	    {
	    	this.ime = ime;
	    }
	    public Nefrolog(String ime, String prezime)
	    {
	    	this.ime = ime;
	    	this.prezime = prezime;
	    }
	    public Nefrolog(String ime, String prezime, String ustanova)
	    {
	    	this.ime = ime;
	    	this.prezime = prezime;
	    	this.ustanova = ustanova;
	    }
	    public Nefrolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja)
	    {
	    	this.ime = ime;
	    	this.prezime = prezime;
	    	this.ustanova = ustanova;
	    	this.datumZaposljavanja = datumZaposljavanja;
	    }
	    public Nefrolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja, int brojPacijenata)
	    {
	    	this.ime = ime;
	    	this.prezime = prezime;
	    	this.ustanova = ustanova;
	    	this.datumZaposljavanja = datumZaposljavanja;
	    	this.brojPacijenata = brojPacijenata;
	    }
	    public Nefrolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja, int brojPacijenata, String odeljenje)
	    {
	    	this.ime = ime;
	    	this.prezime = prezime;
	    	this.ustanova = ustanova;
	    	this.datumZaposljavanja = datumZaposljavanja;
	    	this.brojPacijenata = brojPacijenata;
	    	this.odeljenje = odeljenje;
	    }
	    public Nefrolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja, int brojPacijenata, String odeljenje, int godineIskustva)
	    {
	    	this.ime = ime;
	    	this.prezime = prezime;
	    	this.ustanova = ustanova;
	    	this.datumZaposljavanja = datumZaposljavanja;
	    	this.brojPacijenata = brojPacijenata;
	    	this.odeljenje = odeljenje;
	    	this.godineIskustva = godineIskustva;
	    }
	    
		public int getBrojPacijenata() {
			return brojPacijenata;
		}
		public void setBrojPacijenata(int brojPacijenata) {
			this.brojPacijenata = brojPacijenata;
		}
		public String getOdeljenje() {
			return odeljenje;
		}
		public void setOdeljenje(String odeljenje) {
			this.odeljenje = odeljenje;
		}
		public int getGodineIskustva() {
			return godineIskustva;
		}
		public void setGodineIskustva(int godineIskustva) {
			this.godineIskustva = godineIskustva;
		}
	    
}
