package exercicio9.eng2020_1_a09.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicio9.eng2020_1_a09.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findOneByLoginAndSenha(String login, String senha);

}