package no.hvl.dat108.oblig4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

	
	@GetMapping (value="/login")
	public String innlogging(Model model) {
		return "innlogging";
	}
	
	@PostMapping (value="/login")
	public String innlogg(@RequestParam String mobil, HttpServletRequest request, RedirectAttributes ra) {
		
		if(mobil == null || mobil.length() < 3) {
			ra.addFlashAttribute("redirectMessage", "Mobilnummeret er ikke registrert");
			return "redirect:registrering";
		}
		
		LoginUtil.loggInnBruker(request, mobil);
		
		return "redirect:registrering";
		//return "redirect:deltakerliste";
	}
	
	@PostMapping ("/logout")
	public String logout(HttpSession session, RedirectAttributes ra) {
		ra.addFlashAttribute("redirectMessage", "Du er logget ut");
		return "redirect:innlogging";
	}
}