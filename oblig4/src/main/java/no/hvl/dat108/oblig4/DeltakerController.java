package no.hvl.dat108.oblig4;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class DeltakerController {
	
	
	@GetMapping (value="/registrering")
	public String paameldingmethod(Model model) {
		model.addAttribute("deltaker", new Deltaker());
		return "registrering";
	}
	
	// Må lage en redirdect
	@PostMapping("lagreDeltaker")
	public String lagreDeltaker(@Valid @ModelAttribute("deltaker")Deltaker deltaker, HttpSession session, BindingResult bindingResult) {
		

		if(bindingResult.hasErrors()) {
			return "registrering";
		}
		
		System.err.println(deltaker);
		session.setAttribute("bekreftelse",deltaker);
		
		//Tester om verdiene passer
		String RegeFornavn ="^[A-ZÆØ][A-Za-zÆØÅæøå]{2,19}$";
		String RegeTlf = "^\\d{8}$";
		System.err.println(deltaker.getTlf().matches(RegeTlf));
		
		
		return "redirect:paameldt";
	}
	
	@GetMapping("/paameldt")
	public String paameldt(HttpSession session) {
		System.err.println("Bekreftelse av: " + session.getAttribute("bekreftelse"));
		return "paameldt";
	}
	@PostMapping("/paameldt")
	public String paameldtRe(HttpSession session) {
		return "redirect:deltakerliste";
	}
}