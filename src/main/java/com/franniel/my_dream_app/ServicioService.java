package com.franniel.my_dream_app;

import java.util.List;

public interface ServicioService {
	
	List<Servicio>listar();
	Servicio listarId(int id);
	Servicio add(Servicio s);
	Servicio edit(Servicio s);
	Servicio delete(int id);
	
}
