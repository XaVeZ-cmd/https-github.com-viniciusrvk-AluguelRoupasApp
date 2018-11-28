package modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity(name="Emprestimo")  
public class EmprestimoConc extends Emprestimo{
	public EmprestimoConc () {}
	public EmprestimoConc (Usuario usuario, Material material, Date inicio, int prazo, int status) {
		this.usuario = usuario;
		this.material = material;
		this.inicio = inicio;
		this.prazo = prazo;
		this.status = status;
	}
}
