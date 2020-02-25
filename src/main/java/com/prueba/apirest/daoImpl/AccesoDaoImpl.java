package com.prueba.apirest.daoImpl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.prueba.apirest.bean.Usuario;
import com.prueba.apirest.dao.AccesoDao;

@Repository
public class AccesoDaoImpl implements AccesoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall jdbcCall;
	
	@Override
	public Usuario validarUsuario(String usuario) {
		Usuario usu = null;
		
		usu = new Usuario();
		usu.setCodigoUsuario(BigDecimal.valueOf(1));
		usu.setUsuario("jambrocio");
		usu.setDatos("Jorge Ambrocio");
		usu.setCargo("Analista Programador");
		
		/*
		try {
			jdbcCall = new SimpleJdbcCall(jdbcTemplate.getDataSource());
			//jdbcCall.setSchemaName("dbo");
			jdbcCall.withProcedureName("usp_movil_validar_usuario").declareParameters(
					new SqlParameter("usuario", 			Types.VARCHAR));

			MapSqlParameterSource parametros = new MapSqlParameterSource();
			parametros.addValue("usuario", 			usuario);
			
			Map<String, Object> results = jdbcCall.execute(parametros);
			List<Map<String, Object>> rs1 = (List<Map<String, Object>>) results.get(Constantes.RESULSET_1);
			
			if (rs1.size() > 0) {
				for (Map<String, Object> map : rs1) {
					
					usu = new Usuario();
					
					usu.setCodigoUsuario((BigDecimal)				map.get("CODIGO_USUARIO"));
					usu.setUsuario((String)							map.get("USUARIO"));
					usu.setDatos((String)							map.get("DATOS"));
					usu.setCargo((String)							map.get("CARGO"));
										
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		return usu;
	}

}
