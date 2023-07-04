package srilupro.Tiger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 @RestController
public class amdocspro2 {
	@GetMapping("/get")
	public String print() {
		return "hi this is my first project";
	}

}
