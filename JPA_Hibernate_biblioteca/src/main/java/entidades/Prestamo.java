package entidades;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the prestamos database table.
 * 
 */
@Entity
@Table(name="prestamos")
@NamedQuery(name="Prestamo.findAll", query="SELECT p FROM Prestamo p")
public class Prestamo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrestamoPK id;

	//bi-directional many-to-one association to Socio
	@ManyToOne
	@JoinColumn(name="id_socio", insertable=false, updatable=false)
	private Socio socio;

	//bi-directional many-to-one association to Libro
	@ManyToOne
	@JoinColumn(name="isbn", insertable=false, updatable=false)
	private Libro libro;

	public Prestamo() {
	}

	public PrestamoPK getId() {
		return this.id;
	}

	public void setId(PrestamoPK id) {
		this.id = id;
	}

	public Socio getSocio() {
		return this.socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}