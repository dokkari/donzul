package dok.donzul.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dok.donzul.entity.TbMstUser;

@Controller
public class DefaultController {
//	@Autowired
//	private TbMstUserMapper userMapper;
	
	@RequestMapping("/")
	public String index(Model model) {
		UserDetails user = (TbMstUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("user", user);
		return "index";
	}
}
