package net.cj.edu.awsdevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
 // 그냥 페이지 만들땐 @Controller  >> return값.html 울 놈감
 // RestControll > return값 를 넘김
	
	@GetMapping("/")
	// = @RequestMapping(vale="/", method = RequgestMethod.GET)
	public String home() {
		return "<h1>aws-devops</h1>";
	}
}
