package no.hvl.dat108.paamelding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HalloController {
	
	
	//Request er at den håndterer alle forespørseler selv om de er get eller post
	@GetMapping(value = "/htmlhilsen")
	public String htmlHallo(Model model, @RequestParam String person) {
		// først er det oppslags ord og så verdi som blir lagt inn i attribute
		model.addAttribute("person", person);
		return "hilsen";
	}
		
		
	//Request er at den håndterer alle forespørseler selv om de er get eller post
	@GetMapping (value = "/hilsen", produces = "text/plain")
	@ResponseBody
	public String siHallo(@RequestParam String person) {
		return "Hallo " + person + "!";
	}
	
	//Getmapping er at den tar kun get requester
		@GetMapping (value = "/json")
		@ResponseBody
		public Hilsen jsonHallo(@RequestParam String person) {
			return new Hilsen(person);
		}
}