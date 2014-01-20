package com.zxd.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/forward")
public class ForwardController {
	
	@RequestMapping(value="/fore/{result}")
	public @ResponseBody String forword(@PathVariable(value="result")String result){
		return "redirect:fore/"+result;
	}

}
