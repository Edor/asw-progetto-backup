package progetto;

import org.springframework.data.repository.CrudRepository;

import progetto.dominio.*;

public interface FilmRepository extends CrudRepository<Film, Long> {
	public Film findByTitolo(String titolo);
}
