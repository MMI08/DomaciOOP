package doktor;

import java.time.LocalDate;

public abstract class Doktor {
	
	protected String ime;
    protected String prezime;
    protected String ustanova;
    protected LocalDate datumZaposljavanja;
    
    public Doktor()
    {
    	
    }
    public Doktor(String ime)
    {
    	this.ime = ime;
    }
    public Doktor(String ime, String prezime)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    }
    public Doktor(String ime, String prezime, String ustanova)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    }
    public Doktor(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    	this.datumZaposljavanja = datumZaposljavanja;
    }
    
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getUstanova() {
		return ustanova;
	}
	public void setUstanova(String ustanova) {
		this.ustanova = ustanova;
	}
	public LocalDate getDatumZaposljavanja() {
		return datumZaposljavanja;
	}
	public void setDatumZaposljavanja(LocalDate datumZaposljavanja) {
		this.datumZaposljavanja = datumZaposljavanja;
	}
    
}
