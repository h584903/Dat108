package no.hvl.dat108.paamelding;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DeltakerController {
	
	
	@GetMapping (value="/paamelding")
	public String paamelding(Model model) {
		model.addAttribute("deltaker", new Deltaker());
		return "paamelding";
	}
	
	// Må lage en redirdect
	@PostMapping("lagreDeltaker")
	public String lagreDeltaker(@Valid @ModelAttribute("deltaker")Deltaker deltaker, HttpSession session, BindingResult bindingResult) {
		
		// Hvis vi har errors skal vi gåtilbake med feilmedlingene som automatisk kommer fra form
		if(bindingResult.hasErrors()) {
			return "paamelding";
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
}