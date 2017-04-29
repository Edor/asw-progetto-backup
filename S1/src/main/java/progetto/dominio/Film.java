package progetto.dominio;

import java.util.HashSet;
import java.util.Set;

public class Film {

	private Long id;
	private String titolo;
	private String anno;
	private String genere;
	private Set<Premio> riconoscimenti;

	public Film() {
		super();
	}

	public Film(String titolo, String anno, String genere) {
		super();
		this.titolo = titolo;
		this.anno = anno;
		this.genere = genere;
		this.riconoscimenti = new HashSet<Premio>();
	}
	
	public boolean addPremio(Premio premio) {
		return this.riconoscimenti.add(premio);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Set<Premio> getRiconoscimenti() {
		return riconoscimenti;
	}

	public void setRiconoscimenti(Set<Premio> riconoscimenti) {
		this.riconoscimenti = riconoscimenti;
	}
}
