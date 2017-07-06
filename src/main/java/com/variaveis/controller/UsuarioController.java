package com.variaveis.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/api/usuario")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		goToAnotherOne(request, response);
		getJson(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void goToAnotherOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextJSP = "index.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request, response);
	}
	
	private void getJson(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		List<ObjectNode> lista = new ArrayList<ObjectNode>();
		lista.add(getUsuario(mapper, "Rafael", 35, getTelefone(mapper, 48, 999756380), new Date(1980,6,29)));
		lista.add(getUsuario(mapper, "Wilmor", 55, getTelefone(mapper, 48, 999956989), new Date(1960,6,27)));
		out.print(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lista));
		out.flush();
	}
	
	private ObjectNode getUsuario(ObjectMapper mapper, String nome, Integer idade, JsonNode telefone, Date data) {
		ObjectNode usuario = mapper.createObjectNode();
        usuario.put("nome", nome);
        usuario.put("idade", idade);
        usuario.put("telefone", telefone);
        usuario.put("data", data.getTime());
        return usuario;
	}
	
	private ObjectNode getTelefone(ObjectMapper mapper, Integer codigoArea, Integer numero) {
		ObjectNode telefone = mapper.createObjectNode();
        telefone.put("codigoArea", codigoArea);
        telefone.put("numero", numero);
        return telefone;
	}

}
