package dok.donzul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dok.donzul.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Model model, @RequestParam("id") String id, @RequestParam("pw") String pw) {
		
		UserDetails user = userService.loadUserByUsername(id);
		if(user.getUsername() == null) {
			return "login";
		}
		
		model.addAttribute("user", user);
		
		return "redirect:index";
	}
}
