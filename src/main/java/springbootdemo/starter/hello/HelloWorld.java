package springbootdemo.starter.hello;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping(value="/health")
	public HashMap<String, String> hello() {
		HashMap<String, String> map = new HashMap<>();
	    map.put("status", "Okay");
	    return map;
		
	}
}
