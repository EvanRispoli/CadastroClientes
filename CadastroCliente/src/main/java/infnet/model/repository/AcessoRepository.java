package infnet.model.repository;

import infnet.model.domain.Usuario;

public class AcessoRepository {
	
	public static Usuario validar(String email, String senha) {
		
		if (email.equalsIgnoreCase(senha)) {
			Usuario usuario = new Usuario();
			usuario.setNome("Evan Rispoli");
			usuario.setEmail(email);
			usuario.setSenha(senha);
			
			return usuario;
		}
		
		return null;
		
		
		
		
	}
	/*if (email.equalsIgnoreCase(senha)) {
	request.getRequestDispatcher("home.html").forward(request, response);			
} else { request.getRequestDispatcher("erro.html").forward(request, response);
}*/

}
