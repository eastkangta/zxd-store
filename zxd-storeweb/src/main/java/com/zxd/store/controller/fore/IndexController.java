package com.zxd.store.controller.fore;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxd.core.entity.User;
import com.zxd.core.service.IUserService;

@Controller
@RequestMapping(value="/fore")
public class IndexController {
//	private static Logger logger = g
	
	@Resource
	private IUserService userService ;
	
	@RequestMapping(value="/index")
	public @ResponseBody String index(){
		User user = new User();
		user.setName("郑晓东");
		user.setPassword("131313");
		userService.addUser(user);
		System.out.println("i am in");
		return "fore/index";
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
}
