package doktor;

import java.time.LocalDate;

public class Kardiolog extends Doktor {
	
	private int brojOperacija;
    private boolean radiDezuru;
    
    public Kardiolog()
    {
    	
    }
    public Kardiolog(String ime)
    {
    	this.ime = ime;
    }
    public Kardiolog(String ime, String prezime)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    }
    public Kardiolog(String ime, String prezime, String ustanova)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    }
    public Kardiolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    	this.datumZaposljavanja = datumZaposljavanja;
    }
    public Kardiolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja, int brojOperacija)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    	this.datumZaposljavanja = datumZaposljavanja;
    	this.brojOperacija = brojOperacija;
    }
    public Kardiolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja, int brojOperacija, boolean radiDezuru)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    	this.datumZaposljavanja = datumZaposljavanja;
    	this.brojOperacija = brojOperacija;
    	this.radiDezuru = radiDezuru;
    }
    
	public int getBrojOperacija() {
		return brojOperacija;
	}
	public void setBrojOperacija(int brojOperacija) {
		this.brojOperacija = brojOperacija;
	}
	public boolean isRadiDezuru() {
		return radiDezuru;
	}
	public void setRadiDezuru(boolean radiDezuru) {
		this.radiDezuru = radiDezuru;
	}
    
}
