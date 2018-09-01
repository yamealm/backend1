package com.almea.demo.service;

import java.util.List;

import com.almea.demo.model.User;

public interface UserService {

	/**
	 * Guardar un usuario
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);

	/**
	 * Recupera la lista de usuarios
	 * @return
	 */
	List<User> findAll();

	/**
	 * Eliminar un usuario con el id recibido
	 * @param id
	 */
	void deleteUser(Long id);
	

}
