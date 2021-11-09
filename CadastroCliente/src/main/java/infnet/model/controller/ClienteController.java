package infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import infnet.model.domain.Cliente;
import infnet.model.repository.ClienteRepository;

public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ClienteController() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("home.html").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cliente cliente = new Cliente(request.getParameter("nome"),request.getParameter("email"));
		cliente.setEndereco(request.getParameter("endereco"));
		cliente.setTelefone(request.getParameter("telefone"));
		
		ClienteRepository.incluir(cliente);
		
		List<Cliente> clientes = ClienteRepository.obterLista();
		
		request.setAttribute("nomeCliente", cliente.getNome());
		request.setAttribute("tamanhoLista", clientes.size());
		request.setAttribute("listaClientes", clientes);
		
		request.getRequestDispatcher("cadastro_concluido.jsp").forward(request, response);

	}
}