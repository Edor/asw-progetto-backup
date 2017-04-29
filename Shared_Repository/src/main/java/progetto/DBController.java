package progetto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import progetto.dominio.*;

@RestController
public class DBController {

	@Autowired
	private RegRepository regRepo;
	@Autowired
	private FilmRepository filmRepo;

	@RequestMapping("/regista/{name}")
	public Regista getRegista(@PathVariable String name) {
		return regRepo.findByNome(name);
	}
	
	@RequestMapping("/film/{title}")
	public Film getFilm(@PathVariable String title) {
		return filmRepo.findByTitolo(title);
	}
}
