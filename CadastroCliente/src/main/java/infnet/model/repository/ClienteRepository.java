package infnet.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import infnet.model.conexao.Conexao;
import infnet.model.domain.Cliente;

public class ClienteRepository {
	
	public static boolean incluir (Cliente cliente ) {
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement("INSERT INTO Tdados (nome, endereco, telefone, email) VALUES (?,?,?,?)");
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getEndereco());
			ps.setString(3, cliente.getTelefone());
			ps.setString(4, cliente.getEmail());
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return false;
		}
	
	
	public static List<Cliente> obterLista() {
List<Cliente> lista = new ArrayList<Cliente>();
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement("SELECT * FROM Tdados ORDER BY nome");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Cliente cliente = new Cliente(rs.getString("nome"), rs.getString("email"));
				cliente.setId(rs.getInt("id"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setTelefone(rs.getString("telefone"));
				
				
				lista.add(cliente);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return lista;
		
	}
	
	

}
