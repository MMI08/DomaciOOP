package doktor;

import java.time.LocalDate;

public class Endokrinolog extends Doktor {
	
	private boolean dijabetesSpecijalista;
	private String sertifikat;
	
	public Endokrinolog()
    {
    	
    }
    public Endokrinolog(String ime)
    {
    	this.ime = ime;
    }
    public Endokrinolog(String ime, String prezime)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    }
    public Endokrinolog(String ime, String prezime, String ustanova)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    }
    public Endokrinolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    	this.datumZaposljavanja = datumZaposljavanja;
    }
    public Endokrinolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja, boolean dijabetesSpecijalista)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    	this.datumZaposljavanja = datumZaposljavanja;
    	this.dijabetesSpecijalista = dijabetesSpecijalista;
    }
    public Endokrinolog(String ime, String prezime, String ustanova, LocalDate datumZaposljavanja, boolean dijabetesSpecijalista, String sertifikat)
    {
    	this.ime = ime;
    	this.prezime = prezime;
    	this.ustanova = ustanova;
    	this.datumZaposljavanja = datumZaposljavanja;
    	this.dijabetesSpecijalista = dijabetesSpecijalista;
    	this.sertifikat = sertifikat;
    }
    
	public boolean isDijabetesSpecijalista() {
		return dijabetesSpecijalista;
	}
	public void setDijabetesSpecijalista(boolean dijabetesSpecijalista) {
		this.dijabetesSpecijalista = dijabetesSpecijalista;
	}
	public String getSertifikat() {
		return sertifikat;
	}
	public void setSertifikat(String sertifikat) {
		this.sertifikat = sertifikat;
	}
    
}
