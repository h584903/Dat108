package no.hvl.dat108.paamelding;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/liste")
public class ListController {
	
	@GetMapping
	public String visListe(HttpSession session, RedirectAttributes ra) {
		
		// Sjekker om brukeren er logget inn gjennom session data
		if(!LoginUtil.erBrukerInnlogget(session)) {
			ra.addFlashAttribute("redirectMessage", "Du er ikke innlogget");
			return "redirect:innlogging";
		}
		
		return "paamelding";
	}
}
