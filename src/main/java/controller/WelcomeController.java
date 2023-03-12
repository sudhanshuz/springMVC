package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String printMessage(Model model)
	{
		model.addAttribute("msg","Welcome to the homepage");
		return "message";
	}
}
