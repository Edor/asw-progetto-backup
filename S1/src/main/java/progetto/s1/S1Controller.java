package progetto.s1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import progetto.dominio.*;

@RestController
public class S1Controller {

	@RequestMapping("/S1/{name}")
	public String getDescription(@PathVariable String name) {
		Regista result = this.getRegista("http://localhost:8085/regista/"+name);
		if (result == null) return "Errore: oggetto non trovato.";
		return result.getNome() + " è " + result.getDescrizione() + ". ";
	}

	private Regista getRegista(String uri) {
		return new RestTemplate().getForObject(uri,Regista.class);
	}

}
