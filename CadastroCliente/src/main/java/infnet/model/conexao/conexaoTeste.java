package infnet.model.conexao;


public class conexaoTeste {
	
	public static void main(String[] args) {
		
		System.out.println("YES");
		if (Conexao.obterConexao() != null) {
			System.out.println("YES");
			
		} else {
			System.out.println("NO");

		}
	}
}