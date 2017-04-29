package progetto;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import progetto.dominio.*;

@SpringBootApplication
public class SharedRepositoryApplication {

	@Autowired
	private RegRepository regRepo;
	@Autowired
	private FilmRepository filmRepo;
	@Autowired
	private PremioRepository premioRepo;

	@PostConstruct
	public void init() {
		Regista r = new Regista("Tarantino","cruento");
		Film f1 = new Film("Hateful Eight","2015","western");
		Film f2 = new Film("Pulp Fiction","1994","thriller");
		Premio p1 = new Premio("oscar","2000");
		Premio p2 = new Premio("oscar","2002");
		Premio p3 = new Premio("oscar","2015");
		
		f1.addPremio(p3);
		f2.addPremio(p1);
		f2.addPremio(p2);
		r.addFilm(f1);
		r.addFilm(f2);
		
		regRepo.save(r);
		filmRepo.save(f1);
		filmRepo.save(f2);
		premioRepo.save(p1);
		premioRepo.save(p2);
		premioRepo.save(p3);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SharedRepositoryApplication.class, args);
	}
}
