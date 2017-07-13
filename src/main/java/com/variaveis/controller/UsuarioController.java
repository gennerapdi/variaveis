package com.variaveis.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.variaveis.entity.Usuario;
import com.variaveis.service.UsuarioService;

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
	
	private void goToAnotherOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextJSP = "index.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioService service = new UsuarioService();
		try {
			List<Usuario> usuarios = service.findAll();
			getJson(request, response, usuarios);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioService service = new UsuarioService();
		try {
			service.save(getUsuarioFromRequest(request));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private JSONObject getJson(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder();
        BufferedReader br;
		try {
			br = request.getReader();
			String str = null;
			while ((str = br.readLine()) != null) {
				sb.append(str);
			}
			return new JSONObject(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private Usuario getUsuarioFromRequest(HttpServletRequest request) {
		JSONObject jObj = getJson(request);
		Usuario usuario = new Usuario();
		usuario.setNome(jObj.getString("nome"));
		usuario.setIdade(jObj.getInt("idade"));
		usuario.setTelefone(getTelefoneFromRequest(jObj));
		usuario.setData(getData(jObj));
		return usuario;
	}
	
	private Date getData(JSONObject jObj) {
		try {
			String dateStr = jObj.getString("data");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private Integer getTelefoneFromRequest(JSONObject jObj) {
		JSONObject telefone = jObj.getJSONObject("telefone");
		return telefone.getInt("numero");
	}
	
	private void getJson(HttpServletRequest request, HttpServletResponse response, List<Usuario> usuarios) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		List<ObjectNode> lista = new ArrayList<ObjectNode>();
		for (Usuario usuario : usuarios) {
			lista.add(getUsuario(mapper, usuario.getNome(), usuario.getIdade(), usuario.getTelefone(), usuario.getData()));
		}
		out.print(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lista));
		out.flush();
	}
	
	private ObjectNode getUsuario(ObjectMapper mapper, String nome, Integer idade, Integer telefone, Date data) {
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
