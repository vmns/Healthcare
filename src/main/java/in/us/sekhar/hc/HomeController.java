package in.us.sekhar.hc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/show")
	public String show() {
		return "Homepage";
	}
}
