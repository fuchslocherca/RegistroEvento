package cl.inacap.registroEventosModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.registroEventosModel.dto.Asistente;

@Local
public interface AsistentesDAOLocal {

	void save (Asistente asistente);
	List<Asistente> getAll();
	void delete (Asistente asistente);
	List<Asistente> filterByRut(String rut);
}
