package com.prueba.apirest.busImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.prueba.apirest.bean.Usuario;
import com.prueba.apirest.bus.AccesoBus;
import com.prueba.apirest.dao.AccesoDao;

@Service
public class AccesoBusImpl implements AccesoBus {
	
	private Gson gson;
	
	@Autowired
	private AccesoDao accesoDao;
	
	@Override
	public Usuario validarUsuario(String usuario) {
	
		return accesoDao.validarUsuario(usuario);
	}

}
