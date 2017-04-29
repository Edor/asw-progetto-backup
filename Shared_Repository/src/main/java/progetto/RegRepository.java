package progetto;

import org.springframework.data.repository.CrudRepository;

import progetto.dominio.*;

public interface RegRepository extends CrudRepository<Regista, Long>{
	public Regista findByNome(String nome);
}
