package dok.donzul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dok.donzul.entity.TbMstUser;
import dok.donzul.mapper.TbMstUserMapper;

@Controller
public class DefaultController {
//	@Autowired
//	private TbMstUserMapper userMapper;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
