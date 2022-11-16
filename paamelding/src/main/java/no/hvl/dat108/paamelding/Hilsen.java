package no.hvl.dat108.paamelding;

public class Hilsen {

	String person;
	String tekst = "Hei på deg";
	
	public Hilsen(String person) {
		this.person = person;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	
}
