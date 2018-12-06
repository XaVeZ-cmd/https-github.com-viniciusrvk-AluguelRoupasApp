package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="Material")
public class MaterialConc extends Material{
	
	@Column
	float preco;
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	public MaterialConc () {}
	public MaterialConc (int id) {
		set_id(id);
	}
	
	public MaterialConc(int id, String nome) {
		set_id(id);
		set_nome(nome);
	}
	
}
