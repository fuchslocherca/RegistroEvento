package cl.inacap.registroEventosApp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrarAsistenteController
 */
@WebServlet("/RegistrarAsistenteController.do")
public class RegistrarAsistenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrarAsistenteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Agregar asistenteeeeee ").append(request.getContextPath());
		request.getRequestDispatcher("WEB-INF/vistas/registrarAsistente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> errores = new ArrayList<>();

//    Rut de largo 10, debe incluir un guión separador y el lado derecho de la separación debe tener
//    largo 1. Es clave primaria de la tabla
		String rut = request.getParameter("rut.txt").trim();
		if (rut.isEmpty()) {
			errores.add("El campo no puede estar vacío, intente nuevamente");
		}

//    Nombre no puede estar vacio
		String nombre = request.getParameter("nombre.txt").trim();
		if (nombre.isEmpty()) {
			errores.add("El campo no puede estare vacío, ingrese su nombre");
		}
//    Apellido no puede estar vacío
		String apellido = request.getParameter("apellido.txt").trim();
		if (apellido.isEmpty()) {
			errores.add("El campo no puede estare vacío, ingrese su apellido");
		}

//    Empresa no puede estar vacío y ademas con largo minimo de 6
		String empresa = request.getParameter("empresa.txt").trim();
		String[] letras = empresa.split("");
		if (empresa.isEmpty()) {
			errores.add("El campo no puede estare vacío, ingrese el nombre de empresa");
		} else {
			if (letras.length < 6) {
				errores.add("El nombre de la empresa debe contener al menos 6 caracteres, intente nuevamente ");
			}

		}
//    Debe selecionar una opcion
		String estado = request.getParameter("estado.txt").trim();
		if (estado.isEmpty()) {
			errores.add("Debe selecionar un estado ");
		}

//    Debe selecionar una opcion
		String region = request.getParameter("region.txt").trim();
		if (region.isEmpty()) {
			errores.add("Debe selecionar una region");
		}

		if (errores.isEmpty()) {
			request.setAttribute("mensaje", "Asistente Registrado exitosamente");
		} else {
			request.setAttribute("errores", errores);
		}

		doGet(request, response);

	}

}
