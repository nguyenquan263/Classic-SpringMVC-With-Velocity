package net.qanguyen.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String ShowIndex(ModelMap model) {
		return "index";
	}

	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public String ShowTodosList(ModelMap model) {
		return "todos/list";
	}
}