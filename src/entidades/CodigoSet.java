package entidades;

import java.util.Objects;

public class CodigoSet {

	private Integer codigo;

	public CodigoSet(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodigoSet other = (CodigoSet) obj;
		return Objects.equals(codigo, other.codigo);
	}
}
