package progetto.s2;

import java.util.Iterator;
import java.util.Set;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import progetto.dominio.*;

@RestController
public class S2Controller {

	// Ritorna un film e il PRIMO premio ad esso registrato
	@RequestMapping("/S2/{title}")
	public String getDescription(@PathVariable String title) {
		Film result = this.getFilm("http://localhost:8085/film/"+title);
		if (result == null) return "Errore: oggetto non trovato.";
		Set<Premio> tempSet = result.getRiconoscimenti();
		Iterator<Premio> iter = tempSet.iterator();
		Premio primo = (Premio) iter.next();
		return result.getTitolo() + " ha vinto un premio " + primo.getTipo() + " nel " + primo.getAnno() + ". ";
	}

	private Film getFilm(String uri) {
		return new RestTemplate().getForObject(uri,Film.class);
	}

}
