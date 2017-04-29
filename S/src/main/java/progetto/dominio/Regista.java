package progetto.dominio;

import java.util.HashSet;
import java.util.Set;

public class Regista {

	private Long id;
	private String nome;
	private String descrizione;
	private Set<Film> produzioni;
	
	public Regista() {
		super();
	}
	
	public Regista(String nome, String descrizione) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.produzioni = new HashSet<Film>();
	}
	
	public boolean addFilm(Film film) {
		return this.produzioni.add(film);
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public Set<Film> getProduzioni() {
		return produzioni;
	}
	
	public void setProduzioni(Set<Film> produzioni) {
		this.produzioni = produzioni;
	}
}
