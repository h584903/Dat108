package no.hvl.dat108.paamelding;

import java.time.LocalDate;

public class Person {
	private String navn;
	private String tlf;
	private int hoydecm;
	private LocalDate fdato;
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public int getHoydecm() {
		return hoydecm;
	}
	public void setHoydecm(int hoydecm) {
		this.hoydecm = hoydecm;
	}
	public LocalDate getFdato() {
		return fdato;
	}
	public void setFdato(LocalDate fdato) {
		this.fdato = fdato;
	}
	
	
}
