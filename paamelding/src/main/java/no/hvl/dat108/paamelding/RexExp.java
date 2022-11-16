package no.hvl.dat108.paamelding;

public class RexExp {
	
	String START = "^";
	String SLUTT = "$";
	String x_NULL_ELLER_FLERE = "*";
	String x_EN_ELLER_FELERE = "+";
	String x_NULL_ELLER_EN = "?";
	String x_ÅTTE = "{8}";
	String STOR_BOKSTAV_AÅ = "[A-ZÆØÅ]";
	String BOKSTAV_AÅ = "[A-Za-zÆØÅæøå]";
	String SIFFER = "\\d";
	
	String eksakt (String regexp) {
		return START + regexp + SLUTT;
	}
}
