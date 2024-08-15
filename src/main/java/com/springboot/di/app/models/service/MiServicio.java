package com.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("ServicioSimple") // Se anota de esta forma para indicar que es un clase del core del negocio
							// tambien se puede @Component es lo mismo
public class MiServicio implements IServicio {

	@Override
	public String operacion() {

		return "Esta es la operacion que realizamos, muy sencilla o simple";
	}

}