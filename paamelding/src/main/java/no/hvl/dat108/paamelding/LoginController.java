package no.hvl.dat108.paamelding;

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
	
	@Value("${app.message.invalidUsername}") private String INVALID_USERNAME;
	
	@Value("${app.message.loggedOut}") private String LOGGUT;
	
	
	@GetMapping (value="/login")
	public String innlogging(Model model) {
		return "innlogging";
	}
	
	@PostMapping (value="/login")
	public String innlogg(@RequestParam String username, HttpServletRequest request, RedirectAttributes ra) {
		
		if(username == null || username.length() < 3) {
			ra.addFlashAttribute("redirectMessage",INVALID_USERNAME);
			return "redirect:innlogging";
		}
		
		LoginUtil.loggInnBruker(request, username);
		
		
		return "redirect:deltakerliste";
	}
	
	@PostMapping ("logout")
	public String logout(HttpSession session, RedirectAttributes ra) {
		ra.addFlashAttribute("redirectMessage", LOGGUT);
		return "redirect:innlogging";
	}
}
