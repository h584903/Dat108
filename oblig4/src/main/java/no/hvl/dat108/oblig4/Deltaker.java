package no.hvl.dat108.oblig4;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//@Entity
//@Table(schema = "oblig4")
public class Deltaker {
	
	
	@Size(min=2, message="Fornavn må være over 2 bokstaver")
	@Size(max=19, message="Fornavn må bære under 19 bokstaver")
	// BeanValidering
	private String fornavn;
	
	private String etternavn;
	//@Id
	@Pattern(regexp = "^\\d{8}$", message="Mobilnummer må være eksakt 8 siffer")
	private String tlf;
	private String kjonn;
	private String passord;
	private String validerings_passord;
	private String salt;
	
	
	
	@Override
	public String toString() {
		return "Deltaker [fornavn=" + fornavn + ", etternavn=" + etternavn + ", tlf=" + tlf + ", kjonn=" + kjonn
				+ ", passord=" + passord + ", validering_passord=" + validerings_passord + "]";
	}
	
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public String getKjonn() {
		return kjonn;
	}
	public void setKjonn(String kjonn) {
		this.kjonn = kjonn;
	}
	public String getPassord() {
		return passord;
	}
	public void setPassord(String passord) {
		this.passord = passord;
	}
	public String getValiderings_passord() {
		return validerings_passord;
	}
	public void setValiderings_passord(String validerings_passord) {
		this.validerings_passord = validerings_passord;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
}