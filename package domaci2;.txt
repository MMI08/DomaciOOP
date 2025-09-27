package domaci2;

public class Ucenik {
	private String ime;
    private String prezime;
    private int godine;
    private String smer;
    private String odeljenje;
    
    public Ucenik(String ime) {
        this.ime = ime;
    }
    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    public Ucenik(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }
    public Ucenik(String ime, String prezime, int godine,String smer) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.smer = smer;
    }
    public Ucenik(String ime, String prezime, int godine,String smer,String odeljenje) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.smer = smer;
        this.odeljenje = odeljenje;
    }
}
