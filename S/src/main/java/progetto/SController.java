package progetto;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SController {

	@RequestMapping("/S/{name}")
	public String getOutput(@PathVariable String name) {		
		return getRegista("http://localhost:8081/S1/"+name);
	}
	
	@RequestMapping("/S/{name}/{title}")
	public String getOutput(@PathVariable String name, @PathVariable String title) {		
		return getRegista("http://localhost:8081/S1/"+name) + " " + getFilm("http://localhost:8082/S2/"+title);
	}

	private String getRegista(String uri) {
		return new RestTemplate().getForObject(uri,String.class);
	}
	
	private String getFilm(String uri) {
		return new RestTemplate().getForObject(uri,String.class);
	}
}
