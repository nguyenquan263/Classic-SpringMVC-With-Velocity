package net.qanguyen.Controllers;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String ShowIndex(ModelMap model) {
		return "index";
	}
	
	@RequestMapping(value = "/countdown", method = RequestMethod.GET)
    public String countdown(Model model) {

        // Target datetime
        LocalDateTime target = LocalDateTime.of(2025, 12, 13, 12, 30);
        LocalDateTime now = LocalDateTime.now();

        Duration diff = Duration.between(now, target);
        long seconds = diff.getSeconds();

        if (seconds <= 0) {
            model.addAttribute("finished", true);
            return "countdown.vm";
        }

        long days = seconds / (60 * 60 * 24);
        long hours = (seconds / (60 * 60)) % 24;
        long minutes = (seconds / 60) % 60;
        long secs = seconds % 60;

        model.addAttribute("days", days);
        model.addAttribute("hours", hours);
        model.addAttribute("minutes", minutes);
        model.addAttribute("seconds", secs);

        return "countdown";
    }

//	@RequestMapping(value = "/todos", method = RequestMethod.GET)
//	public String ShowTodosList(ModelMap model) {
//		return "todos/list";
//	}
}