package progetto.dominio;

public class Premio {

	private Long id;
	private String tipo;
	private String anno;

	public Premio() {
		super();
	}

	public Premio(String tipo, String anno) {
		super();
		this.tipo = tipo;
		this.anno = anno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}
}
