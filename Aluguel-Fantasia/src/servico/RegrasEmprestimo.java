package servico;

import controle.TelaAlertaErro;
import dao.EmprestimoDAO;
import modelo.Emprestimo;
import modelo.Material;
import modelo.MaterialConc;
import modelo.Usuario;

public class RegrasEmprestimo extends AbsRegrasEmprestimo{

	// SE ELE JA TIVER ALUGUEL, NAO PODE FAZER OUTRO
	@Override
	public boolean regras_adicionais(Usuario usuario, Material material, EmprestimoDAO emprestimoDAO) {
		if (emprestimoDAO.get_por_id_usuario(usuario.get_id()) > 0) {
			return false;
		}else {
			for (Emprestimo emprestimo : emprestimoDAO.get_emprestimos()) {
				if(emprestimo.get_material().equals( material)) {
					new TelaAlertaErro("Custa: "+(emprestimo.get_prazo()* ((MaterialConc) material).getPreco()));
				}
			}
			return true;
		}
	}
	
	@Override
	public void calc_param(Usuario usuario, Material material) {		
	}
	
}
