package com.franniel.my_dream_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioServiceImp implements ServicioService {
	
	@Autowired
	private ServicioRepository repositorio;

	@Override
	public List<Servicio> listar() {
		
		return repositorio.findAll();
		
	}

	@Override
	public Servicio listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servicio add(Servicio s) {
		
		return repositorio.save(s);
		
	}

	@Override
	public Servicio edit(Servicio s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servicio delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
