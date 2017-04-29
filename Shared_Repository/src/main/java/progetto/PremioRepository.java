package progetto;

import org.springframework.data.repository.CrudRepository;

import progetto.dominio.*;

public interface PremioRepository extends CrudRepository<Premio, Long> {
	public Premio findById(Long id);
}
