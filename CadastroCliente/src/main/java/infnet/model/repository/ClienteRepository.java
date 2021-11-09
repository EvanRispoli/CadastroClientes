package infnet.model.repository;

import java.util.ArrayList;
import java.util.List;

import infnet.model.domain.Cliente;

public class ClienteRepository {
	
	private static List<Cliente> lista;
	
	private static void prepara() {
		if(lista == null) {
			lista  = new ArrayList<Cliente>();
		}
		 
		
	}
	
	public static boolean incluir (Cliente cliente ) {
		
		try {
			prepara();
			
			lista.add(cliente);
			
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	public static List<Cliente> obterLista() {
		return lista;
		
	}
	
	

}
